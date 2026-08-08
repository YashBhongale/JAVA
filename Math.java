We can use Math. functions for calculation/making calculation easier.
Math Functions:
Math.pow(base,power);
Math.abs(); <-- gives absolute value (+) of any number entered.
Math.round();  <-- rounds up to nearest int.
Math.ceil(); <-- rounds up the value entered.
Math.floor();  <-- rounds down the value.
Math.sqrt();  <-- finds square root of entered value.
Math.Max(num,num)  <-- select the maximum number between the given two values.
Math.min(num,num)  <-- selects minimum value between the given two values.
Math.PI  <-- value of pi.

//Hypotenuse of right angled triangle

import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of A: ");
    int a = sc.nextInt();
    System.out.print("Enter value of B: ");
    int b = sc.nextInt();

    double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));    <-- need to take double for accurate results.
    System.out.println("The Hypotenuse of triangle is " + c);

    sc.close();
  }
}

//Circumference of a circle

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of a circle (int): ");
    int r = sc.nextInt();

    double cur = 2*Math.PI*r;
    System.out.print("The value of circumference of the circle of given radius is " + cur + " cm.");  
    sc.close();
  }
}

