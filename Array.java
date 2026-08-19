//Array: It is collection of values of similar data type.(Variable which can store more than one values).

Syntax:
String[] fruit = {a,b,c}
//Arrays fall under reference type variable so on returning direct value of an array it returns memory address.
//To print an array we need to print it element by element.

System.out.print(fruit[0])    //->[0] ndex number.

//To print full array

public class Main{
    public static void main(String[] args){
        String[] fruit = {"Apple","Banana","orange","Pear"};
        int length = fruit.length;
        for(int i = 0; i<length;i++){
            System.out.println(fruit[i]);
        }
    }
}

//We can use Array library by importing it  -> import java.util.Arrays;
//Arrays.sort(fruit)        -> it sorts array of fruit in ascending order.
//Arrays.fill(fruit,"Mango")        ->it stores new given value in the Whole array.

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String[] fruits = {"Apple","Pineapple","Banana","Orange"};
        print(fruits);
        Arrays.sort(fruits);
        print(fruits);
        Arrays.fill(fruits,"Pear");
        print(fruits);
    }
    static void print(String[] fruits){
        int length = fruits.length;
        for(int i = 0; i<length;i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
    }
}

//Taking the user input for an array.
//We need to fix an definite size of array.

String[] fruits = new String[4];
//Here by using new keyword we are creating an array of size 4.
//Note We cannot input more values than the the given value as it is the maximum input where as we can input less values.

public class Main{
    public static void main(String[] args){
        String[] fruits = new String[4];

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        fruits[3] = "Pear";

        for(int i =0;i<4;i++){
            System.out.printf("%s ",fruits[i]);
        }
    }
}

//Using Enhanced for loop.

public class Main{
    public static void main(String[] args){
        String[] fruits = new String[4];

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        fruits[3] = "Pear";

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
