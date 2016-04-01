package bankapp;

/**
 *
 * @author thanguyen
 */
/**
 * A bank account with a name and balance.
 */
public class BankAccount {

    /**
     * Constructs a bank account.
     *
     * @param aName the name on the bank account
     * @param aBalance the bank account balance
     */
    public BankAccount(String aName, double aBalance) {
        name = aName;
        balance = aBalance;
    }

    /**
     * Gets the name on the bank account.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the bank account balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;

    }

    private final String name;
    private final double balance;
}
