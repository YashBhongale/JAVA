public class Main {

    public static void main(String[] args){

    //P1
        println is used for printing a single line
        System.out.print("Hello\n");
        System.out.println("How are you?");
        System.out.println("I am fine");

    //P2
        int age = 10;
        double pi = 3.14;
        char grade = 'A';
        boolean isStudent = false;
          if(isStudent){
                    System.out.println("You are a student.");
                }
                else{
                    System.out.println("You are not a student.");
          }
        

        String Name = "Berus";

    }
}

Variable = A reusable container for values

Primitive var = simple value directly stored in stack
Refrence var = memory address that points to heap

Primitive        vs        Reference 
------------------------------------
int                        string
double                     array
char                       object
boolean

 Setps in creating variable
1. Declaration
2. Assignment

//Variable Scope: Where a variable can be access.
//Local variables: Variables defined in a method are called local variable.
//Class variables: Variables defined in the Main class are known as class variables.

public class Main{
    int x = 1;//Class
    public static void main(String[] args){
        int x = 2;//Local
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 3;//Local 
        System.out.println(x);
    }
}
//JAVA prefer local variable over Class variable.

//Static Keyword: Make variable or method belong to a class rather than any specific object. Commonly used for utility methods or shared resources.
//As previous if we create friends class and returned total number of friends we get different copy of numOffriends for diff object so we use static so that it belongs to class and not specific object.
//Main class.
public class Main {
    public static void main(String[] args) {

        Friend f1 = new Friend("Berus");
        Friend f2 = new Friend("Beerus");
        Friend f3 = new Friend("Beeerus");

        Friend.showFriends();
    }
}

//Friend class.
public class Friend{
    String name;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " in Total.");
    }
}


    
