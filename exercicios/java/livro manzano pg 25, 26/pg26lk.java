import java.util.Scanner;

public class pg26lk {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double quantidade_real, convercao, cotacao_dolar;

    System.out.print("Informe a quantidade de R$: ");
    quantidade_real = scan.nextDouble();
    System.out.print("\nInforme a cotaçao do $ de hoje: ");
    cotacao_dolar = scan.nextDouble();

    convercao = quantidade_real * cotacao_dolar;

    System.out.println("REAL R$: " + quantidade_real + " = DOLAR $: " + convercao);
    } 
}
