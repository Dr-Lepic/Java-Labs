package LAB.L4.example4;

public class BankAccount {
    private String accountID;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        if (isValidAccountID(accountID)) {
            this.accountID = accountID;
            System.out.println("Account ID Valid");
        } else {
            System.out.println("Invalid format. Please use XXX-XXXX-XXXX");
        }
    }

    private boolean isValidAccountID(String accountID) {
        return accountID.matches("\\d{3}-\\d{4}-\\d{4}");
    }

}
