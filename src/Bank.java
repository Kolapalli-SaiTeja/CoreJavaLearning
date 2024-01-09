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

    public  int currentAmount() {

        return currentBalance;

    }

    public static void main(String[] args) {

        Bank calling = new Bank();

        calling.Congratulations();

        System.out.println("your balance in your account is" + '\t' + calling.currentAmount());


        calling.deposit(500);
        System.out.println("your balance after depositing is" + '\t' +calling.currentAmount());

        calling.withdraw(200);
        System.out.println("your balance after withdrawal is" + '\t' + calling.currentAmount());

        System.out.println("your final balance in your account is" + '\t' + calling.currentAmount());


    }


}


