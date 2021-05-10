import java.util.Scanner;

public class pg25lc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alt_lata, raio_lata;

        System.out.print("digite a altura da lata de oleo em centimetros: ");
        alt_lata = scan.nextDouble();

        System.out.print("digite a o raio da lata de oleo em centimetros: ");
        raio_lata = scan.nextDouble();

        double formula = 3.14 * (Math.pow(raio_lata,2)) * alt_lata ;
       
        System.out.println("volume da lata de oleo: " + formula);
    }
    
}
