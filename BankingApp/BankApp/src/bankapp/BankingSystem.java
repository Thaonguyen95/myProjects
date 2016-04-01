package bankapp;

import java.util.*;
import java.util.Comparator;

/**
 *
 * @author thanguyen
 */
/**
 * A banking system that maintains a list of account objects.
 */
public class BankingSystem{

    ArrayList<BankAccount> banksystem;

    /**
     * Constructs a banking system.
     */
    public BankingSystem() {
        banksystem = new ArrayList<BankAccount>();
    }

    /**
     * Adds new BankAccount object to the banking system.
     *
     * @param aName the name on the bank account
     * @param aBalance the bank account balance
     */
    public void addAccount(String aName, double aBalance) {
        banksystem.add(new BankAccount(aName, aBalance));
    }

    /**
     * Compares two accounts by name.
     *
     * @param increasing the direction of the sort
     * @return a negative number if account1 has a alphabetically smaller name
     * than account2, 0 if the names are the same, a positive number otherwise
     */
    public static Comparator<BankAccount>
            comparatorByName(final boolean increasing) {
        Comparator<BankAccount> comp = new Comparator<BankAccount>() {
            public int compare(BankAccount account1, BankAccount account2) {
                if (increasing) {
                    return account1.getName().compareTo(account2.getName());
                }
                return (-1) * (account1.getName().compareTo(account2.getName()));
            }
        ;
        };
        return comp;
    }

    /**
     * Compares two accounts by balance.
     *
     * @param increasing the direction of the sort
     * @return (in the case of an ascending sort) a negative number if account1
     * has a smaller balance than account2, 0 if the ballance are the same, a
     * positive number otherwise; and the reverse if the sort is in descending
     * order (increasing is false)
     */
    public static Comparator<BankAccount>
            comparatorByBalance(final boolean increasing) {
        Comparator<BankAccount> comp = new Comparator<BankAccount>() {
            public int compare(BankAccount account1, BankAccount account2) {
                int sign = 1;
                if (!increasing) {
                    sign = -1;
                }
                if (account1.getBalance() < account2.getBalance()) {
                    return -1 * sign;
                }
                if (account1.getBalance() > account2.getBalance()) {
                    return 1 * sign;
                }
                return 0;
            }
        ;
        };
        return comp;
    }
}
