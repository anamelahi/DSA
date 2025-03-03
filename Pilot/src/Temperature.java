import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");

        float temperatureC = in.nextFloat();
        float temperatureF = (temperatureC * 9/5) + 32;

        System.out.println(temperatureF);
    }
}
