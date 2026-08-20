//varargs = allows method to accept varuing argumments makes method more flexible so we donot need overloading.
//Java will pack info in an array and sent to the function so we cant print it directly as it will give memory address.
//We use ... (Ellipsis) for defining an varying array.
Syntax: static void add(int... num){}

//Using varargs for creating addition and average function.

public class Main{
    public static void main(String[] args){
        System.out.println("Addition: " + add(1,2,3,4));
        System.out.print("Average: " + avg(1,2,3,4,5,1));
    }

    static int add(int... number){
        int sum = 0;
        for(int num : number){
            sum += num;
        }
        return sum;
    }

    static double avg(int... num){
        if(num.length == 0){
          return = 0;
        }
        double avg = (double)add(num)/num.length;    //->Even though avg is declared as double, the division has already happened as integer division.
        return avg;                                  //->To fix this, convert one value to double before division:
    }
}
