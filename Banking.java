import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean isRunning = true;
        int choice;
        double balance = 0;

        while(isRunning){
            System.out.println("-----Banking Program-----");
            System.out.println("1.Show balance: \n2.Deposit: \n3.Withdraw: \n4.Exit: ");
            System.out.print("Your choice: ");

            choice = sc.nextInt();


            switch (choice){

                case 1 -> showBalance(balance);
                case 2 -> balance -= withdraw();
                case 3 -> balance += deposit();
                case 4 -> isRunning = false;

            }
        }
    }


    static double withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        double withdraw = sc.nextDouble();

        if(withdraw <0){
            System.out.println("Cant withdraw negative value.");
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
        System.out.printf("Your balance is %f.\n",balance);
    }
}
