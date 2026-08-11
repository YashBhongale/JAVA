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
