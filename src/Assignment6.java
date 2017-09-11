/*
Morgan Norwood
 Assignment 6.8
 This assignment prints out a table using the methods that convert celsius to  fahrenheit
 */


public class Assignment6 {
    //Celsius to Fahrenheit conversion method
    private static double celsiusToFahrenheit(double celsius) {
        double F;
        F = (9.0 / 5) * celsius + 32;
        return F;
    }
    //Fahrenheit to Celsius conversion method
    private static double fahrenheitToCelsius(double fahrenheit) {
        double C;
        C = (5.0 / 9) * (fahrenheit - 32);
        return C;

    }

    public static void main(String[] args){
        //  Table headers
        System.out.println(
                "Celsius     Fahrenheit     |Fahrenheit     Celsius\n" +
                        "______________________________________________________");
        // prints data and formats the table
        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            //celsius values (1st column)
            System.out.printf("%-12.1f", celsius);
            //Fahrenheit conversions (2nd column)
            System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
            //Fahrenheit values (3rd column)
            System.out.printf("%-20.1f", fahrenheit);
            //celsius conversions(4th column)
            System.out.printf("%-7.1f\n", fahrenheitToCelsius(fahrenheit));



        }

    }

}