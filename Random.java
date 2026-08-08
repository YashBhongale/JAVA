radom used same as scanner by calling import function for random,
i.e. "import jav.utils.Random".

It is used to get a random value in fixed range its default range is from -2Bill to 2Bill.

//UsingRandom with if/else statement

import java.util.Random;

public class Main{
  public static void main(String[] args){
    Random rd = new Random();
    boolean isStudent = rd.nextBoolean();

    if(isStudent){
      System.out.print("You are a student");
    }
    else{
      System.out.print("You are not a student");
    }  
  }
}

Unlike Scanner, Random do not relies on input stream (Syatem.in) so,
there is no need for clos() function to use.
