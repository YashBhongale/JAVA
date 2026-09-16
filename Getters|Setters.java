//They help protect object data and add rules for accessing or modifying
//Getters: Make the method feild redable.
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Car car = new Car("Mustang","Black",1000000);

        System.out.println("You have " + car.getColor() + " " + car.getModel() + " valued " + car.getPrice());
    }
}
public class Car  {
    private String Model;
    private String Color;
    private int Price;

    Car(String Model, String Color, int Price) {
        this.Model = Model;
        this.Color = Color;
        this.Price = Price;
    }

    String getModel() {
        return this.Model;
    }
    String getColor() {
        return this.Color;
    }
    String getPrice() {
        return "$" + this.Price;
    }
}
