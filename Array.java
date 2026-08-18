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
