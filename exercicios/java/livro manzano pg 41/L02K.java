import java.util.Scanner;

public class L02K {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("digite um numero: ");
        num = scan.nextInt();

        if(num >3)
        {
            System.out.println(num);
        }
        else{
            System.out.println("nada a declarar");
        }
    }
    
}

