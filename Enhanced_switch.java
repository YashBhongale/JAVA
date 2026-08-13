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
