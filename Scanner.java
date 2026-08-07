Scanner => Simple text scanner which allows system to scan a user input.
For example this code allows system to get an integer input.
-> Sacnner scanner = new Scanner(System.in);
    int i = scanner.nextInt();

import java.util.Scanner; <--needed to access the library.

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();

        System.out.print("Your name is: " + name);
    }
}

there are two different things:

Scanner → A class (blueprint) provided by Java.
sc → An object (variable/reference) of the Scanner class.

Scanner	-> Class provided by Java to read input
sc	-> Object/reference variable of the Scanner class
new	-> Creates a new object
Scanner(System.in)	-> Constructor that creates a Scanner to read keyboard input
sc.nextLine()	-> Reads a full line of input
sc.close()	-> Closes the Scanner

We need need to close the scanner by .close comand cause if we do naot it can occupy unnecessary memory from system 

There is exception for one case if we take and input and the immediate next input/command is string it does not get accepted
cause it register previous enter as carecter and remains in the buffer, hence not storing the value. The trick here it to add
sc.nextLine();command between those two to remove that input buffer.
