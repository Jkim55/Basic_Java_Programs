import java.awt.*;
import java.util.Scanner;

public class Quadratic_Formula
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Welcome! This program takes 3 inputs of doubles & returns the result of plugging in those " +
                            "values into the quadratic formula. \n" +
                            "Only real number inputs will extend in a result.\n");

        System.out.println("Please enter a non zero number for a");
        double a = scan.nextDouble();

        System.out.println("Please enter a non zero number for b");
        double b = scan.nextDouble();

        System.out.println("Please enter a non zero number for c");
        double c = scan.nextDouble();

        double result_one = (-1 * b + Math.sqrt(b * b - 4 *  a * a))/(2 * a);
        double result_two = (-1 * b - Math.sqrt(b * b - 4 *  a * a))/(2 * a);

        System.out.println("The first result of the quadratic formula for the values: " + a + ", " + b + ", and " + c +
                           " is " + result_one);
        System.out.println("The second result of the quadratic formula for the values: " + a + ", " + b + ", and " + c +
                           " is " + result_two);

    }
}
