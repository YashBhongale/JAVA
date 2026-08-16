//Method is a block of reuseable code which is executed when it is called.

public class Main{
    public static void main(String[] args){
        HappyBirthday();
    }

    static void HappyBirthday(){
        System.out.println("Happy Birthday!");
    }
}

//Different block of codes cant access each others information or variables so we need to pass argument-
//while calling a method so that method can access the given value. Arguments can be value or variables.
//for accepting the argument method should have parameters. Argument and parameters should have same sequence and datatype.

public class Main{
  public static void main(String[] args){
    int age = 20;
    String name = "Berus";
    happyBirthday(name,age);
  }

  static void happyBirthday(String name, int age){    //<--variable name in parameter can differ with argument.
    System.out.println("Happy Birthday!");
    System.out.printf("Happy Birthday dear %s\n",name);
    System.out.printf("Your age is %d",age);
  }
}

//Returning a number using method

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter a number: ");
        double a = sc.nextInt();
        double c;
        double b = rd.nextInt(1,11);
        sc.close();

        c = Square(a);       
        System.out.printf("The square of your given number is %.4f.\n",c);
        c = Square(b);
        System.out.printf("The square of random number is %.3f.",c);

    }

    static double Square(double num){      //<--Since we are returning a value we need to change our return type from void to int to return integer value.
        return Math.pow(num,2);    //<-- We can directly write single linee calculation in return statement,also pow method need double data type to store.
    }
}
