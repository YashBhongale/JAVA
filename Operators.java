The priority is P-E-M-D-A-S
Parenthesis->Exponent->Multiplication->Division->Addition->Substraction

//Shopping cart Program

import java.util.Scanner;
public class Main{
  public static void main(String[] args){

    String name;
    double price = 0;
    int quantity = 0;
    double total = 0;
    char currency = '$';

    Scanner sc = new Scanner(System.in);
    
    System.out.print("What would you like: ");
    name = sc.nextLine();
    
    System.out.print("What is the price of one " + name + ": ");
    price = sc.nextDouble();

    System.out.print("How many " + name + "/s" + " you would like to buy: ");
    quantity = sc.nextInt();

    total = quantity*price;

    System.out.print("Your total bill is " + currency + total);
    
    sc.close();
    
  }
}

// &&, ||, ! Operators:
&& -> AND Operator.
|| -> OR Operator.
! -> NOT Operator.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Username: ");
        String username = sc.nextLine();

        if(username.length() < 4 || username.length()>12){
            System.out.print("Username must have characters in between 4-12.");
            return;
        }
        else if(username.contains(" ")){
            System.out.print("Username can't contain any spaces.");
            return;
        }

        System.out.print("Enter a Password: ");
        String password = sc.nextLine();

        System.out.println("Username: " + username);
        System.out.print("Password: " + password);
        sc.close();

    }
}
