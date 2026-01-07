package challanges;

public class BankAccount {
    private int accountNumber;
    private int bankBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, int bankBalance, String customerName, String email, int phoneNumber){
        this.accountNumber=accountNumber;
        this.bankBalance=bankBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void credit(int deposit_Amount){
        bankBalance+=deposit_Amount;
        System.out.println("Your Bank balance is $"+bankBalance);
    }

    public void debit(int withdrawl_Amount){
        if (withdrawl_Amount>bankBalance){
            System.out.println("Withdrawl Denied low bank balance $"+bankBalance);
        }
        else {
            bankBalance-=withdrawl_Amount;
            System.out.println("Remaining balance in bank account is $"+bankBalance);
        }
    }
}

class run{
    static void main() {
        BankAccount first = new BankAccount(001,100,"ss","ss.do@gmail.com",4444);
        first.credit(1000);
        first.debit(2000);
        first.debit(200);
    }
}
