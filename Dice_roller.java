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
