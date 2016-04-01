package bankapp;

/**
 *
 * @author thanguyen
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankingSystem bankSystem = new BankingSystem();
        bankSystem.addAccount("Thao", 1000);
        bankSystem.addAccount("Juleen", 500);
        bankSystem.addAccount("Anna", 800);

        System.out.println("Print out the initial list:");
        System.out.print(bankSystem);
        System.out.println();

        System.out.println("Sort accounts by balance in increasing order:");
        Collections.sort(bankSystem, BankingSystem.comparatorByBalance(true));
        System.out.print(bankSystem);
        System.out.println();
    }
}
