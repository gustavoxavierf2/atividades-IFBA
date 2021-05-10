import java.util.Scanner;

public class L02B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        double numero = scan.nextInt();

        if(numero < 0){
            double conta = numero * (-1);
            System.out.println("módulo do número fornecido = " + conta);
        }
        else{
            System.out.println("módulo do número fornecido = " + numero);
        }
    } 
}
