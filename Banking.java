import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean isRunning = true;
        int choice;
        double balance = 0;

        while(isRunning){
            System.out.println("-----Banking Program-----");
            System.out.println("1.Show balance: \n2.Withdraw: \n3.Deposit: \n4.Exit: ");
            System.out.print("Your choice: ");

            choice = sc.nextInt();


            switch (choice){

                case 1 -> showBalance(balance);
                case 2 -> balance -= withdraw(balance);
                case 3 -> balance += deposit();
                case 4 -> isRunning = false;

            }
        }
        System.out.println("have a nice day!");
    }


    static double withdraw(double balance) {
        System.out.print("Enter the amount you want to withdraw: ");
        double withdraw = sc.nextDouble();

        if(withdraw <0){
            System.out.println("Cant withdraw negative value.");
            return 0;
        }
        else if(withdraw > balance){
            System.out.println("Balance is Insufficient!");
            return 0;
        }
        else{
            return withdraw;
        }
    }

    static double deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        double deposit = sc.nextDouble();

        if(deposit <0){
            System.out.println("Cant deposit negative value.");
            return 0;
        }
        else{
            return deposit;
        }

    }

    static void showBalance(double balance){
        System.out.printf("Your balance is $%.2f.\n",balance);
    }
}
