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

//Taking an user input in array.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] fruit ;
        int size;

        System.out.print("Enter number of fruits you want to store");
        size = sc.nextInt();
        fruit = new String[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter a fruit you want to store");
            fruit[i] = sc.next();
        }
        for(String UI : fruit){
            System.out.print(UI + " ");
        }
        sc.close();
    }
}

//Searching in an array.
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,2,4,0,6,8,5,3,7,9};
        boolean isFound = false;
        int target;

        System.out.print("Enter the number to find its position (0-9): ");
        target = sc.nextInt();

        for(int i = 0; i < 10; i++){
            if(numbers[i]==target){        //.equals() is used for String like functions.
                isFound = true;
                System.out.print("The number is found at the index " + i + ".");
            }
        }
        if(!isFound){
                System.out.print("The given number is not found in array.");
            }
        sc.close();
        
    }
}

//2D Arrays.
//An Array Where each element is an array, useful for storing matrix of data.
Syntax: String[][] foods = {fruits,meat,vegetables};

public class Main{
    public static void main(String[] args){
        String[] fruits = {"Apple","Banana","Pineapple"};
        String[] meat = {"Chicken","Duck","Fish"};
        String[] vegetable = {"Cabage","Onion","Potato"};

        String[][] groceries = {fruits,meat,vegetable};

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}

//We can access elements by first accessing the internal array.
//we can also change specific element by inputing matrix value.

public class Main{
    public static void main(String[] args){
        String[] fruits = {"Apple","Banana","Pineapple"};
        String[] meat = {"Fish","Chicken","Duck"};
        String[] vegetable = {"Cabage","Onion","Potato"};

        String[][] groceries= {fruits,meat,vegetable};
        groceries[0][0] = "Mango";

        for(String[] foods : groceries){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
        
    }
}

//Making a 2D array which resembles dailpad.

public class Main{
    public static void main(String[] args){
        char[][] dailpad = {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}};

        for(char[] row : dailpad){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

// Quiz Game.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] question = {"What is 1 + 1?",
                "What is capital of India?",
                "Which data structure follows the LIFO principle?",
                "Which keyword is used to create an object in Java?"};

        String[][] option = {{"1.3","2.4","3.2","4.3"},
                {"1.Mumbai","2.New Delhi","3.Kolkata","4.Chennai"},
                {"1.Queue","2.Array","3.Stack","4.Linked List"},
                {"1.class","2.new","3.object","4.create"}};

        int[] answers = {3,2,3,2};
        int guess;
        int score = 0;

        System.out.println("Welcome!");
        for(int i = 0; i<4 ; i++){
            System.out.println(question[i]);
            for (int j = 0;j<4;j++){
                System.out.println(option[i][j]);
            }
            System.out.print("Enter your Choice: ");
            guess = sc.nextInt();
            if(guess == answers[i]){
                score++;
                System.out.println("Correct!!");
            }
            else{
                System.out.println("Wrong!!");
                System.out.println("---------------------");
                continue;
            }
            System.out.println("---------------------");

        }
        System.out.println("Your final Score is " + score);

    }
}
