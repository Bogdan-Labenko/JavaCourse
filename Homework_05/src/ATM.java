import java.util.HashMap;
import java.util.Map;

class ATMException extends Exception {
    public ATMException(String message) {
        super(message);
    }
}
class InvalidWithdrawalAmountException extends ATMException {
    public InvalidWithdrawalAmountException(String message) {
        super(message);
    }
}

public class ATM {
    private Map<Integer, Integer> availableNotes;
    private int minWithdrawAmount;
    private int maxNotesToDispense;

    public ATM(int minWithdrawAmount, int maxNotesToDispense){
        availableNotes = new HashMap<>();
        for (int denomination: BanknoteDenominations.DENOMINATIONS){
            availableNotes.put(denomination, 0);
        }
        this.maxNotesToDispense = maxNotesToDispense;
        this.minWithdrawAmount = minWithdrawAmount;
    }

    public void loadMoney(int denomination, int count) {
        availableNotes.put(denomination, availableNotes.getOrDefault(denomination, 0) + count);
    }
    public void loadMoney(Map<Integer, Integer> notes){
        availableNotes.putAll(notes);
    }
    public void depositMoney(int denomination, int count) {
        availableNotes.put(denomination, availableNotes.getOrDefault(denomination, 0) + count);
    }
    public Map<Integer, Integer> getAvailableNotes() {
        return availableNotes;
    }
    public int getMinWithdrawAmount(){
        return minWithdrawAmount;
    }
    public int getMaxNotesToDispense(){
        return maxNotesToDispense;
    }
    public Map<Integer, Integer> withdrawMoney(int amount) throws ATMException {
        if (amount < minWithdrawAmount){
            throw new InvalidWithdrawalAmountException("The requested amount is too small to issue!");
        }

        Map<Integer, Integer> withdrawResult = new HashMap<>();
        int remainingAmount = amount;

        for (int denomination : new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1}) {
            if (remainingAmount >= denomination && availableNotes.get(denomination) > 0) {
                int notesToDispense = Math.min(remainingAmount / denomination, availableNotes.get(denomination));
                withdrawResult.put(denomination, notesToDispense);
                remainingAmount -= notesToDispense * denomination;
            }
        }

        if (remainingAmount == 0 && withdrawResult.size() <= maxNotesToDispense) {
            for (Map.Entry<Integer, Integer> entry : withdrawResult.entrySet()) {
                int denomination = entry.getKey();
                int notesDispensed = entry.getValue();
                availableNotes.put(denomination, availableNotes.get(denomination) - notesDispensed);
            }
            return withdrawResult;
        } else {
            throw new InvalidWithdrawalAmountException("The requested amount " + amount + " cannot be issued!");
        }
    }
}
