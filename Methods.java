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

//Overloading Methods:Methods that share the same name , but different parameters Signature = name + parameter.

public class Main{
    public static void main(String[] args){
        int age = 20;
        String name = "Berus";
        info(age);
        info(name);
        info(age,name);
        
    }
    static void info(int age){
        System.out.printf("Your age is %d.\n",age);
    }
    static void info(String name){
        System.out.printf("Your name is %s.\n",name);
    }
    static void info(int age, String name){
        System.out.printf("Your name is %s.\n",name);
        System.out.printf("Your age is %d.",age);
    }
}
//Overriding: Method overriding in Java occurs when a subclass provides a specific implementation for a method that is already defined in its parent (superclass). It is the foundational mechanism used to achieve runtime polymorphism (also known as dynamic method dispatch),
//meaning Java decides which version of the method to execute at runtime based on the actual object type, not the reference variable type.

public class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        Fish fish = new Fish();

        dog.move();
        fish.move();

        dog.sleep();
        fish.sleep();
    }
}
public class Animal {
    void move(){
        System.out.println("Is Running...");
    }
    void eat(){
        System.out.println("Is eating");
    }
    void sleep(){
        System.out.println("Is sleeping Zzzzz...");
    }
}
public class Dog extends Animal {
    void move(){
        System.out.println("Is Running...");
    }
}
public class Fish extends Animal{
    void move(){
        System.out.println("Is Swimming");
    }
    void sleep(){
        System.out.println("Is Sleeping Ooooo...");
    }
}

//tostring(): It is inbuilt method in class while creating object which returns hashcode of object when direct object return is invoked.
//We can override it and use it to define specific features.
public class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        System.out.println(dog);
    }
}
public class Dog extends Animal {
    void move(){
        System.out.println("Is Running...");
    }

    @Override
    public String toString() {
        return "Is Running...";
    }
}
