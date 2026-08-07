import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int height;
    int width;
    int area;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Height of Rectangle: ");
    height = sc.nextInt();

    System.out.print("Enter Width of Rectangle: ");
    width = sc.nextInt();

    area = height*width;
    System.out.print("The Area of Rectangle is " + area);

    sc.close();
  }
}
