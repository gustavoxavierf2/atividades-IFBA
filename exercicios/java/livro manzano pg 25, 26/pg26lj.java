import java.util.Scanner;

public class pg26lj {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double quantidade_dolar, convercao, cotacao_dolar;

    System.out.print("Informe a quantidade de $: ");
    quantidade_dolar = scan.nextDouble();
    System.out.print("\nInforme a cotaçao do $ de hoje: ");
    cotacao_dolar = scan.nextDouble();

    convercao = quantidade_dolar * cotacao_dolar;

    System.out.println("DOLAR $: " + quantidade_dolar + " = REAL R$: " + convercao);
    } 
}
