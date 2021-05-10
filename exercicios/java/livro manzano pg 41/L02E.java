import java.util.Scanner;
public class L02E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  variavel_a, variavel_b, variavel_c;
        double delta, x1, x2;
        
        System.out.println("Ax^2 + B + C = 0: ");

        System.out.print("Insira o valor de A: ");
        variavel_a = scan.nextInt();
        System.out.print("Insira o valor de B: ");
        variavel_b = scan.nextInt();
        System.out.print("Insira o valor de C: ");
        variavel_c = scan.nextInt();

        if (variavel_a != 0)
    {
      delta = Math.pow(variavel_b,2) - 4 * variavel_a * variavel_c;
      System.out.println("Delta = " + delta);
      
      if (delta > 0)
      {
        x1 = (-variavel_b + Math.sqrt(delta)) / ( 2 * variavel_a );
        x2 = (-variavel_b - Math.sqrt(delta)) / ( 2 * variavel_a );
        System.out.println("As Raízes da equação são: x': " + x1 + " e x'': " + x2);
      }
      else
        if (delta == 0)
        {
          x1 = -variavel_b / ( 2 * variavel_a );
          System.out.println("x' = x'' = " + x1);
        }
        else
          System.out.println("Não existem raízes reais!");
    }
    else
      System.out.println("Com a = 0 não é uma equação do 2o grau");
  }
}
