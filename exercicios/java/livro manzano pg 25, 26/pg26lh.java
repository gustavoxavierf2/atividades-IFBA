import java.util.Scanner;

public class pg26lh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double comprimento, largura, altura;

        System.out.print("informe a comprimento: ");
        comprimento = scan.nextDouble();
        System.out.print("informe a largura: ");
        largura = scan.nextDouble();
        System.out.print("informe a altura: ");
        altura = scan.nextDouble();

        Double volume = comprimento * largura * altura;

        System.out.println("volume da caixa: " + volume);        
    }
    
}
