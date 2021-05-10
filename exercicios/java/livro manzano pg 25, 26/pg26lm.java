import java.util.Scanner;

public class pg26lm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor A : ");
        Double valor_A = scan.nextDouble();

        System.out.print("Valor B : ");
        Double valor_B = scan.nextDouble();

        System.out.print("Valor C : ");
        Double valor_C = scan.nextDouble();

        Double soma = valor_A + valor_B + valor_C;
        Double E_quadrado = soma * soma;

        System.out.println("resultado final da soma dos quadrados: " + E_quadrado);
    }
    
}
