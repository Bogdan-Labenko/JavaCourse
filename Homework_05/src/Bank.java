import java.util.Map;

class Bank {
    private ATM[] atms;
    private int numATMs;

    public Bank(int numATMs) {
        this.numATMs = numATMs;
        this.atms = new ATM[numATMs];
    }


    public ATM[] getAtms(){
        return atms;
    }
    public ATM getAtm(int index){
        return atms[index];
    }
    public void initializeATMs() {
        for (int i = 0; i < numATMs; i++) {
            atms[i] = new ATM(10, 30);
        }
    }

    public int getTotalMoneyInATMs() {
        int totalMoney = 0;
        for (ATM atm : atms) {
            for (Map.Entry<Integer, Integer> entry : atm.getAvailableNotes().entrySet()) {
                totalMoney += entry.getKey() * entry.getValue();
            }
        }
        return totalMoney;
    }
}