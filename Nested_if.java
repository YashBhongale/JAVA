We can write if/else statements inside if else these are called nested if-else.

import java.util.Scanner;

public class Main{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Student: ");
    boolean isStudent = sc.nextBoolean();

    System.out.print("Senior: ");
    boolean isSenior = sc.nextBoolean();

    if(isStudent){
      if(isSenior){
        System.out.print("You are Student and a Senior.");
      }
      else{
        System.out.print("You are Student but not a Senior.");
      }
    }
    else{
      if(isSenior){
        System.out.print("You are not a Student but you are a Senior.");
      }
      else{
        System.out.print("You are not a Student and also not a Senior.");
      }
    }
    sc.close();
  }
}
