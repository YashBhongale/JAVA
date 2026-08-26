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
