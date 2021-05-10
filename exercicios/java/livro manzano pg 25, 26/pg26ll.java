import java.util.Scanner;

public class pg26ll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor A : ");
        Double valor_A = scan.nextDouble();

        System.out.print("Valor B : ");
        Double valor_B = scan.nextDouble();

        System.out.print("Valor C : ");
        Double valor_C = scan.nextDouble();

        Double E_quadrado1 = valor_A * valor_A;
        Double E_quadrado2 = valor_B * valor_B;
        Double E_quadrado3 = valor_C * valor_C;

        Double soma = E_quadrado1 + E_quadrado2 + E_quadrado3;

        System.out.println("resultado final da soma dos quadrados: " + soma);
        
    }
    
}
