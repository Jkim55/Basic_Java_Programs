import java.util.Scanner;

public class Circle_Area_Perimeter {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("This program takes a double for the radius and outputs the area & circumference of a circle" +
                "along with the radius. \n");

        System.out.println("Please enter a value for the radius. \n");
        double radius = scan.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = Math.PI * radius;

        System.out.println("Given a circle with radius: " + radius + ". \n" +
                "The area of the circle is " + area + ". \n" +
                "The circumference of the circle is " + circumference + ". \n");
    }

}
