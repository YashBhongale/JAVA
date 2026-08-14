//While Loop
//-> The while loop keeps repeating when a certain condition is true.
//-> it can also keep repeating infinitely.

import java.util.Scanner;

public  class Main{
  public static void main(String[] args){
    String name;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    name = sc.nextLine();
    
    while(name.isEmpty()){
      System.out.print("Enter your name: ");
      name = sc.nextLine();
    }

    System.out.print("Your name is " + name);
    sc.close();
  }
}

import java.util.Scanner;

public  class Main{
  public static void main(String[] args){
    String name;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    name = sc.nextLine();
    
    while(name.isEmpty()){
      System.out.print("Enter your name: ");
      name = sc.nextLine();
    }

    System.out.print("Your name is " + name);
    sc.close();
  }
}

//Number guessing game 

import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num = rd.nextInt(1,11);
        int guess;

        System.out.println(num);

        do{
            System.out.print("Enter your guess(1-10): ");
            guess = sc.nextInt();

            if(guess == num){
                System.out.print("You guessed it correctly.");
            }
            else{
                System.out.println("Opps! Try again.");
            }

        }while(guess != num);

        sc.close();
    }
}
