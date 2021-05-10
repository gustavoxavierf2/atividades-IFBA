import java.util.Scanner;

public class pg25la{
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       Float tempcelcius, tempFahrenheit;

       System.out.print(" Temperatura em Celcius: ");
       tempcelcius = scan.nextFloat();
      
       System.out.println("           ||| ");
       System.out.println("           ||| ");
      
       tempFahrenheit = (9 * tempcelcius + 160)/5;
       System.out.println(" Temperatura em Fahrenheit: " + tempFahrenheit );
       System.out.println("\n");
   }  
}
