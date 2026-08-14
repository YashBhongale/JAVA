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

//Ternary operator ? = Return 1 of 2 values give by you based on the given condition is true or false 
//variable = (condition) ? ifTrue : ifFalse;    <-- This is the syntax for ternary operator

import java.util.Scanner;
public class Main{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Marks: ");
    double marks = sc.nextDouble();
    if(marks<0){
      System.out.print("Please Enter a Positive value.");
      break;    <-- yet to check?
    }
    String result = (marks>35) ? "Pass" : "Fail";
    System.out.print(result);
    sc.close();
  }
}

//Even or Odd

import java.util.Scanner;

public class Main{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it is Even or Odd: ");
    double num = sc.nextDouble();
    String check = (num%2 == 0) ? "Even" : "Odd";
    System.out.print(check);
    sc.close();
  }
}
