//Inheritance: One class inherits the method and attributes from other class  |  child  <-  parent
//Inheritance in Java is a core OOP concept that allows a class to acquire properties and behaviors from another class. It helps in creating a new class from an existing class, promoting code reusability and better organization.

//A subclass can reuse the fields and methods of the parent class without rewriting the code
//A subclass can add its own fields and methods or modify existing ones to extend functionality.

//heirarcical Inheritance.
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class Geeks {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();  

        a = new Cat();
        a.sound(); 

        a = new Cow();
        a.sound();  
    }
}

//Super  (keyword).
//Refer to parent class subclass (subclass <- superclass) used in constructors and method overriding .Calls the parent constructor to initialize attributes.

public class Main{
    public static void main(String[] args){

        Student student = new Student("Yash","Bhongale",9.5);
        student.printGpa();


    }
}
public class Person{
        String first;
        String last;

        Person(String first, String last){
            this.first = first;
            this.last = last;
        }
}
public class Student extends  Person {
    double gpa;

    Student(String First, String Last, double gpa){
        super(First,Last);
        this.gpa = gpa;
    }

    void printGpa(){
        System.out.println(this.first + " " + this.last + "'s gpa is " + this.gpa);
    }
}
