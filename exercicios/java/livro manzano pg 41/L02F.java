import java.util.Scanner;

class L02F {
  public static void main(String[] args) {
    int a, b, c, auxiliar;

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Digite a: ");
    a = scan.nextInt();
    System.out.print("Digite b: ");
    b = scan.nextInt();
    System.out.print("Digite c: ");
    c = scan.nextInt();

        System.out.println("Você digitou: " + a + ", " + b + ", " + c);

    if (a > b)
    {
      auxiliar = a;
      a = b;
      b = auxiliar;
    }
    if (a > c)
    {
      auxiliar = a;
      a = c;
      c = auxiliar;
    }
    if (b > c)
    {
      auxiliar = b;
      b = c;
      c = auxiliar;
    }

    System.out.println("Eu ordenei: " + a + ", " + b + ", " + c);
  }
}
