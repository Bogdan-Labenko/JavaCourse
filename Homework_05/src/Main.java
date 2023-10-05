// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5);
        bank.initializeATMs();
        System.out.println(bank.getTotalMoneyInATMs());
        var atm1 = bank.getAtm(0);
        atm1.loadMoney(500, 3);
        atm1.loadMoney(200, 5);
        atm1.loadMoney(100, 10);
        atm1.loadMoney(5, 20);
        System.out.println(bank.getTotalMoneyInATMs());

        var atm2 = bank.getAtm(1);
        atm2.loadMoney(200, 8);
        atm2.loadMoney(100, 15);
        atm2.loadMoney(10, 12);
        System.out.println(bank.getTotalMoneyInATMs());
        try {
            System.out.println(atm1.withdrawMoney(2000));
            System.out.println(atm1.withdrawMoney(2002));
        }
        catch (ATMException exception){
            System.out.println(exception.getMessage());
        }

    }
}