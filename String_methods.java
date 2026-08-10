String methods consists of different string functions so that it is easy to alter the results or actual string.

//int length = name.length();
//char letter = name.charAt();
//int index = name.indexOf(" ");    <-- first occuring character;
//int lastIndex = name.lastIndexOf(" ");    <-- last occuring character;

//name = name.toUpperCase();    <-- coverts Whole string to uppercase;
//name = name.toLowerCase();    <-- converts Whole string to lowercase;
//name = name.trim();    <-- removes extra spaces;
//name = name.replace("o","a");    <-- replaces the given charater to new one in whole string.

public class Main{
  public static void main(String[] args){
    String name = "Yash Bhongale";

    if(name.isEmpty()){    //<-- isEmpty() checks if the field is empty or not.
      System.out.print("Your name field is empty.");
    }
    else{
      System.out.print("Your name is " + name);
    }

    if(name.contains(" ")){    //<-- contains("") checks if the given char/ste of char in the function is been present in the function or not.
      System.out.print("Your name contains a space. ");
    }
    else{
      System.out.print("Your name do not contains any spaces.");
    }

    if(name.equals("Berus")){    //<-- equals("") checks is given input is same as in the Quotes.It is case sensitive
      System.out.println("Your name can't be Berus.");
    }
    else{
      System.out.println("Hello " + name);
    }
  }
}

We can use name.equalsIgnoreCase("") for case-insesitive.

/*String methods are built-in methods provided by Java's String class
that make it easier to work with and manipulate strings.

length()
Returns the number of characters in the string.

charAt(index)
Returns the character at the specified index.

indexOf()
Returns the index of the first occurrence of the specified character
or string.

lastIndexOf()
Returns the index of the last occurrence.

toUpperCase()
Converts the string to uppercase.

toLowerCase()
Converts the string to lowercase.

trim()
Removes leading and trailing spaces.

replace()
Replaces all occurrences of the specified character or sequence.

isEmpty()
Checks whether the string contains zero characters.

contains()
Checks whether the string contains the specified character or sequence.

equals()
Compares two strings exactly and is case-sensitive.

equalsIgnoreCase()
Compares two strings while ignoring uppercase/lowercase differences.*/


Substring Method 
String substring = name.substring(start,end); used to get a part form main string by using start and end point.

import java.util.Scanner;

public class Main{
    public static void main(String[] args  ){
        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your e-mail address: ");
        email = sc.nextLine();

        username = email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);    //<--we can use only start point if we have to take the substring till end(no end point needed).

        System.out.println("Your E-mail address is " + email);
        System.out.println("Your username is " + username);
        System.out.println("Your domain is " + domain);
        sc.close();
    }
}
