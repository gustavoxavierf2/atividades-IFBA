import java.util.Scanner;

public class L02I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par_impar, num;
        System.out.print("digite um numero: ");
        num = scan.nextInt();

        par_impar = num % 2;
        if(par_impar == 0)
        {
            System.out.println(num + " - PAR");
        }
        else{
            System.out.println(num +" - IMPAR");
        }
    }
    
}
