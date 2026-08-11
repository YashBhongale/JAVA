//Ternary operator ? = Return 1 of 2 values give by you based on the given condition is true or false 
//variable = (condition) ? ifTrue : ifFalse;    <-- This is the syntax for ternary operator

import java.util.Scanner;
public class Main{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Marks: ");
    double marks = sc.nextDouble();
    String result = (marks>35) ? "Pass" : "Fail";
    System.out.print(result);
    sc.close();
  }
}
