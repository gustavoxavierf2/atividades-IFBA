import java.util.Scanner;

public class pg26li {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diferenca, quadrado, valor_A, valor_B;

        System.out.print("Informe o valor A: ");
        valor_A = scan.nextInt();
        System.out.print("\nInforme o valor B: ");
        valor_B = scan.nextInt();

        diferenca = (valor_A - valor_B);
        quadrado = (int) Math.pow(diferenca, 2);

        System.out.println("\nO resultado do quadrado da diferença do  valor A pelo valor B: " + quadrado);    
    }   
}
