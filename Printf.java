Printf is a method in java to format output
//%[flags][width][.precision][specifier-character]    <--the terms after and including % are called format specifier(e.g. %+10.1f).
Here % <- is used to start format specifier, used before specific characters to be allowed to print a value.
Here new line character is not added by default so we need to add new line character manually by "\n".

//Specifier
  
public class Main{
  public static void main(String[] args){

  String name = "Spongebob";
  char firstLetter = 'S';
  double height = 60.5;
  int age = 30;
  boolean isEmployed = true;

  System.out.printf("Hello %s\n",name);
  System.out.printf("Your name starts with %c\n",firstLetter);
  System.out.printf("Your height is %f\n",height);
  System.out.printf("Your age is %d\n",age);
  System.out.printf("Employed: %b\n",isEmployed);

  System.out.printf("%s your age is %d",name,age);
  }
}

//Precision

public class Main{
  public static void main(String[] args){
    double price1 = 9.99;
    double price2 = 2.34;
    double price3 = -3.65;

    System.out.printf("%.1f\n",price1);
    System.out.printf("%.2f\n",price2);    //<-- Precisions are used before Specifier
    System.out.printf("%.3f\n",price3);
    
  }
}

//Flags
+ = Output '+' for any positive numbers.
, = Grouping seprator (e.g. -> 10000000 can be written as 10,000,000).
( = Negative numbers are enclosed in () and do not bear negative sign.
space = Displays minus if negative and space if positive.

public class Main{
  public static void main(String[] args){
    double price1 = 9.56;
    double price2 = 100330.23;
    double price3 = -5.26;

    System.out.printf("%+f\n",price1);
    System.out.printf("%+f\n",price2);
    System.out.printf("%+f\n",price3);

    System.out.printf("%,f\n",price1);
    System.out.printf("%,f\n",price2);
    System.out.printf("%,f\n",price3);

    System.out.printf("%(f\n",price1);
    System.out.printf("%(f\n",price2);
    System.out.printf("%(f\n",price3);

    System.out.printf("% f\n",price1);
    System.out.printf("% f\n",price2);
    System.out.printf("% f\n",price3);
    
  }
}

We also can combine the properties so that we can format the output better way.

//Width
0 = Zero padding.
number = right justified padding.(Width sets minimum field size default is generally right-justified).
negative number = left justified padding.(-ve is a left-justify flag).

public class Main{
  public static void main(String[] args){
    int price1 = 10;
    int price2 = 2;
    int price3 = -7;

    System.out.printf("%03d\n",price1);
    System.out.printf("%03d\n",price2);
    System.out.printf("%03d\n",price3);

    System.out.printf("%2d\n",price1);
    System.out.printf("%3d\n",price2);
    System.out.printf("%4d\n",price3);

    System.out.printf("%-1d\n",price1);
    System.out.printf("%-1d\n",price2);
    System.out.printf("%-2d\n",price3);
  }
}

//Compount Interest calculator A=P[1+r/n]^n*t

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    double principal;
    double rate;
    int n;
    int t;
    double total;

    System.out.print("Enter your Principal Amount: ");
    principal = sc.nextDouble();

    System.out.print("Enter your rate of interest(%): ");
    rate  = sc.nextDouble()/100;

    System.out.print("Enter the number of times money is compunded per year: ");
    n = sc.nextInt();

    System.out.print("Enter the number of years: ");
    t = sc.nextInt();

    total = principal*Math.pow(1+rate/n,n*t);
    System.out.print("The total Amount of money after " + t + " years is " + total);

    sc.close();
  }
}

                                    
