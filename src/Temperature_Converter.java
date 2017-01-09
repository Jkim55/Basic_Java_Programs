import java.util.Scanner;

public class Temperature_Converter {
    public static void main (String[] args){
        System.out.println("This program take the temperature as an input and an input indicating whether we're converting " +
                           "from celsius to fahrenheit & vice versa");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter \"F\" if converting from Fahrenheit. \n" +
                           "Please enter \"C\" if converting from Celsius");

        String temp_key = scan.nextLine();

        if (temp_key.equals("F")){
            System.out.println("Please enter the numerical value of the temperature in Fahrenheit.");
            double temp_value = scan.nextDouble();

            double result = (temp_value - 32)/ 1.8;
            System.out.println("When converting " + temp_value + " from Fahrenheit to Celsius, \n" +
                               "the result is " + result);

        } else if (temp_key.equals("C")){
            System.out.println("Please enter the numerical value of the temperature in Celsius.");
            double temp_value = scan.nextDouble();

            double result = (temp_value * 1.8 + 32);
            System.out.println("When converting " + temp_value + " from  Celsius to Fahrenheit, \n" +
                    "the result is " + result);
        } else {
            System.out.println("Not a valid key. \n" +
                    "Please enter \"C\" or \"F\".");
        }
    }
}
