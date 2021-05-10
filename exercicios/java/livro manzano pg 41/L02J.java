import java.util.Scanner;

public class L02J {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("digite um numero: ");
        num = scan.nextInt();

        if(num > 0 && num < 9)
        {
            System.out.println("O valor está na faixa permitida");
        }
        else{
            System.out.println("O valor está fora da faixa permitida");
        }
    }
    
}
