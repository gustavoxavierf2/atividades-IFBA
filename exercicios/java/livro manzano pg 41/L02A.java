import java.util.Scanner;

public class L02A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor A: ");
        int valor_A = scan.nextInt();

        System.out.print("Valor B: ");
        int valor_B = scan.nextInt();

        if (valor_A >= valor_B){
            System.out.println(+ valor_A +" - " + valor_B + " = " + (valor_A - valor_B));
        }
        else{
            System.out.println(+ valor_B +" - " + valor_A + " = " + (valor_B - valor_A));
        }

    }
    
}
