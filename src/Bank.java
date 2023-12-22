package src;

public class Bank {


    static int currentBalance = 2000;

    public void Congratulations() {
        System.out.println("Welcome to zoro banking");
    }

    public void deposit(int depositAmount) {
        currentBalance = currentBalance + depositAmount;
    }

    public void withdraw(int withdrawAmount) {
        currentBalance = currentBalance - withdrawAmount;
    }

    public static int currentAmount() {

        return currentBalance;

    }

    public static void main(String[] args) {

        Bank calling = new Bank();

        calling.Congratulations();

        System.out.println("your balance in your account is" + '\t' + currentAmount());


        calling.deposit(500);
        System.out.println("your balance after depositing is" + '\t' + currentAmount());

        calling.withdraw(200);
        System.out.println("your balance after withdrawal is" + '\t' + currentAmount());

        System.out.println("your final balance in your account is" + '\t' + currentAmount());


    }


}


