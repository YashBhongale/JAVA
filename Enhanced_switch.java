Switch-Case is replacement to many if else statement and make it more readable. 

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Weekday: ");
        String day = sc.next().toLowerCase();
        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.print("It is a Weekday.");
            case "saturday", "sunday" -> System.out.print("It is a Weekend.");
            default -> System.out.println(day + " is not a Day.");
        }
        sc.close();

    }
}

//We can write Switch-case in a better way as seen in above code we can convert it to an enhanced switch,
//so that code compexity is reduced also it is better to write in this way if multiple cases have same output.

//Calculator

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean isValid = true;

        System.out.print("Enter your first number: ");
        num1 = sc.nextDouble();

        System.out.print("Chose operator(+,-,/,*): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter your second number: ");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.print("num2 can't be zero.");
                    return;
                }
                else{
                result = num1/num2;
                }
            }
            case '*' -> result = num1*num2;
            default -> {
                System.out.print("Input a valid operator.");
                isValid = false;
            }

        }

        if(isValid){
            System.out.print(result);
        }
        sc.close();
    }
}

//For checking a char we can't type value in "" double quote we need to use '' single quote's.
//For taking an input for character value we need to write sc.next().charAt(0); statement as it takes input for only first character of a token.
