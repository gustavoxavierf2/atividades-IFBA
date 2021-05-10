import java.util.Scanner;

class L02G {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1, num2, num3, num4, divisivel3, divisivel2, divisivel4,
    divisao1, divisao2, divisao3, divisao4, divisao5, divisao6, divisao7, divisao8, divisivel1;

    System.out.print("Insira um numero: ");
    num1 = scan.nextInt();
    System.out.print("Insira um numero: ");
    num2 = scan.nextInt();
    System.out.print("Insira um numero: ");
    num3 = scan.nextInt();
    System.out.print("Insira um numero: ");
    num4 = scan.nextInt();
    
    divisao1 = num1 % 2;
    divisao2 = num1 % 3;
    divisao3 = num2 % 2;
    divisao4 = num2 % 3;
    divisao5 = num3 % 2;
    divisao6 = num3 % 3;
    divisao7 = num4 % 2;
    divisao8 = num4 % 3;

    if(divisao1 == 0 && divisao2 == 0)
    {
        divisivel1 = num1;
        System.out.println("numeros divisiveis por 2 e 3: "+ divisivel1);
    }
    if(divisao3==0 && divisao4==0)
    {
        divisivel2 = num2;
        System.out.println("numeros divisiveis por 2 e 3: "+ divisivel2);
    }
    if(divisao5==0 && divisao6== 0)
    {
        divisivel3 = num3;
        System.out.println("numeros divisiveis por 2 e 3: "+ divisivel3);
    }
    if(divisao7==0 && divisao8==0)
    {
        divisivel4 = num4;
        System.out.println("numeros divisiveis por 2 e 3: "+ divisivel4);
    }
    }
        
}
    

