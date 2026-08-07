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
