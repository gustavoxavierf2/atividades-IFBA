import java.util.Scanner;
public class pg25lb{
    public static void main(String[] args) {
        Float tempFahrenheit, formula;

        Scanner scan = new Scanner(System.in);

        System.out.print("digite a temperatura em graus Fahrenheit: ");
        tempFahrenheit = scan.nextFloat();

        System.out.println("           ||| ");
        System.out.println("           ||| ");

        formula = (tempFahrenheit - 32) * (5/9);

        System.out.println("temperatura em celcius: " + formula);

    }
}