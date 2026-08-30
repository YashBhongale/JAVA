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
 
