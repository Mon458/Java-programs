import java.util.Scanner;

public class Program23CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        int converted = (int) fahrenheit;

        System.out.println("Temperature in Fahrenheit = " + converted);
    }
}
