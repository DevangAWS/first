package Interfaces.BankManagement;

public class BankAccountManagement {
    public static abstract class BankAccount{
        protected static double balance;

        abstract void bank_Deposit(double amount);

        abstract void bank_Withdraw(double amount);

        void display_Balance(){
            System.out.println("Balance = $"+balance);
        }

    }

    public static class Savings_Account extends BankAccount{

        @Override
        void bank_Deposit(double amount) {
            balance+=amount;
            System.out.println("Deposited Amount is $"+amount+" Balance in account is $"+balance);
        }

        @Override
        void bank_Withdraw(double amount) {
            if (balance>=amount) {
                balance-=amount;
                System.out.println("A Withdraw was made of amount $"+amount+" new balance is $"+balance);
            }
            else System.out.println("Insufficient balance $"+balance);
        }
    }

    static void main() {
        Savings_Account devang = new Savings_Account();
        devang.bank_Deposit(5000);
        devang.bank_Withdraw(800);
    }
}