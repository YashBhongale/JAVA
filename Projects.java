
//Area_of_Rectagle
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int height;
    int width;
    int area;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Height of Rectangle: ");
    height = sc.nextInt();

    System.out.print("Enter Width of Rectangle: ");
    width = sc.nextInt();

    area = height*width;
    System.out.print("The Area of Rectangle is " + area);

    sc.close();
  }
}

//Banking Program
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

//Dice Roller
//Use Win + R and type charmap to get bullet.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int choice;
        int total = 0;
        int no_of_times;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter no. of times you want to roll a die: ");
        no_of_times = sc.nextInt();

        for (int i = 0; i < no_of_times; i++){
            int roll = rd.nextInt(1,7);
            total += roll;
            printdie(roll);
        }
        System.out.println("Your total is " + total);
        sc.close();

    }

    static void printdie(int roll){
        String die1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
                """;
        String die2 = """
                 ---------
                |      ●  |
                |         |
                |  ●      |
                 ---------
                """;
        String die3 = """
                 ---------
                |       ● |
                |    ●    |
                | ●       |
                 ---------
                """;
        String die4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                """;
        String die5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                """;
        String die6 = """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                """;
        switch (roll){
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);
        }
    }
}
