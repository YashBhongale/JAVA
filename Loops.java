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

//For Loops:
//  -> It is a type of loop which can execute code certain amount of time.
//  -> Syntax: for(int i = 0;i<n;i++){
//
//             }

public class Main{
  public static void main(String[] args){
    for(int i = 1 ; i <= 10 ; i++){
      System.out.println(i);
    }
  }
}

//break:Breaking out of a loop(Stop).
//continue:Skip current iteration of a Loop(Skip).

public class Main{
    public static void main(String[] args){
        for(int i = 1;i <= 10;i++){
            if(i == 2){
                continue;
            }
            else if(i == 7){
                break;
            }
            System.out.println(i);
        }
    }
}

//Output: 1 3 4 5 6

//Nested Loops
Loops can be written inside of loof this concept is called nesting.

public class Main{
  public static void main(String[] args){
    int a = 1;
    for(int i = 1;i <= 3;i++){
      for(;a <= 3*i;a++){
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }
}
