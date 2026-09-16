 //Object: An entity that holds Data(Attirbutes), can perform operations/actions like method.
        //It is reference data type.
//Class → Blueprint
//Object → Actual thing created from blueprint
//Attributes → Data of object
//Methods → Actions of object
//Constructor → Initializes an object's data

//Main Class:
public class Main{
    public static void main(String[] args){

        Car car1 = new Car();

        System.out.println(car1.company);
        System.out.println(car1.name);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);

    }
}

//Car class:
public class Car {
    String company = "BMW";
    String name = "BMW M5";
    double price = 1000000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Car Started");
    }

    void stop(){
        isRunning = false;
        System.out.println("Car Stopped");
    }


}

//Objects allow us to group related data and methods together, and each object gets its own copy of the instance fields. 
//Constructors allow us to initialize those fields with different values for different objects.
//But as seen above if we take a car two it would have same attribute so we use consturctors to assign values differently for different objects.

//Constructor: We can use constructor to initialize value to our object,you can pass argument to a constructor to setup initial values for an object.
Syntax: public class Student{Student(){}}    //->here Student() is a constructor is should be same as class name.

//Main class:
public class Main{
    public static void main(String[] args){

        Student s1 = new Student("Berus",20,8.5,true);
        Student s2 = new Student("Yash",21,8.0,false);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gpa);
        System.out.println(s1.isEnrolled);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gpa);
        System.out.println(s2.isEnrolled);

        s1.study();
    }
}

//Student class:
public class Student{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String nm ,int age ,double gpa,boolean isEnrolled) {
        this.name = nm;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void study(){
        System.out.println(this.name + " is Studying.");
    }
}

//As seen above while creating an object we need matching set of arguments accordng to constructor to assign data.
//We can also use methods from other class cause of objects.

//Overloading Constructor same as method overloading they are set to do different things based on sequence and number of arguments.

//Main class:
public class Main{
    public static void main(String[] args){

        User u1 = new User();
        User u2 = new User("Yash");
        User u3 = new User("Berus",20);
        User u4 = new User("Meow",14,"meow@gmail.com");

        u1.print();
        u2.print();
        u3.print();
        u4.print();
    }
}

//User class:
public class User{

    String name;
    int age;
    String email;

    User(){
        this.name = "Not Provided";
        this.age = 0;
        this.email = "Not Provided";

    }
    User(String name){
        this.name = name;
        this.age = 0;
        this.email = "Not Provided";
    }
    User(String name,int age){
        this.name = name;
        this.age = age;
        this.email = "Not Provided";
    }
    User(String name,int age,String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.email);
        System.out.println();
    }

}

//Array of objects:        Same as normal Array but we assign object instead of normal values.
//Main class:

public class Main{
    public static void main(String[] args){

        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("Corvette","Blue");      //<-- we can directly set objects in array.
        Car car3 = new Car("BMW","Black");

        Car[] cars = {new Car("Mustang","Black"),
                      new Car("Corvette","Red"),
                      new Car("BMW","Blue")};

        for (Car car : cars) {
            car.drive();
        }

    }
}

//Car class:
public class Car{
    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive a " + this.color + " " + this.model + ".");
    }
}

//Abstraction: Blueprint of a class ,Used to define class and methods. It is process of hiding implementation details and showing only essential features
abstract class TV{
    
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends TV{
    
    @Override
    void turnOn(){
        
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff(){
        
        System.out.println("TV is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class Geeks{
    
    public static void main(String[] args){
        
        TV remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}

//Interference: An interface in Java is a blueprint that defines a set of methods a class must implement without providing full implementation details. 
//It helps achieve abstraction by focusing on what a class should do rather than how it does it. Interfaces also support multiple inheritance in Java.
import java.io.*;

interface Vehicle {
    
    // Abstract methods defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

// Class implementing vehicle interface
class Bicycle implements Vehicle{
    
    int speed;
    int gear;
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

// Class implementing vehicle interface
class Bike implements Vehicle {
    
    int speed;
    int gear;
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    
}

class Main
{    
    public static void main (String[] args) 
    {
    
        // Instance of Bicycle(Object)
        Bicycle bicycle = new Bicycle();
        
      	bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.print("Bicycle present state : ");
        bicycle.printStates();
        
        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.print("Bike present state : ");
        bike.printStates();
    }
}

//Polymorphism = "Poly" = Many, "Morph" = Shapes , Objects can identify as other objects, they can be treated as object of common super-class.
//We can also attain it by using interfaces.
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {car,boat,bike};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
public abstract class Vehicle {
    abstract void go();
}
public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("Driving a Car...");
    }
}
public class Bike extends Vehicle {
    @Override
    void go() {
        System.out.println("Riding a Bike...");
    }
}
public class Boat extends Vehicle {
    @Override
    void go() {
        System.out.println("Sailing a Boat...");
    }
}

//Runtime polymorphism: the method that gets executed gets decided while runtime based on actual type of object is known as runtime/Dynamic polymorphism.
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle;
        System.out.print("Enter which type of vehicle (1-Car, 2-Bike, 3-Boat): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                vehicle = new Car();
                vehicle.go();
            }
            case 2 -> {
                vehicle = new Bike();
                vehicle.go();
            }
            case 3 -> {
                vehicle = new Boat();
                vehicle.go();
            }
            default -> System.out.println("Invalid choice.");
        }

        sc.close();

    }
}
public abstract class Vehicle {
    abstract void go();
}
public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("Driving a Car...");
    }
}
public class Bike extends Vehicle {
    @Override
    void go() {
        System.out.println("Riding a Bike...");
    }
}
public class Boat extends Vehicle {
    @Override
    void go() {
        System.out.println("Sailing a Boat...");
    }
}
