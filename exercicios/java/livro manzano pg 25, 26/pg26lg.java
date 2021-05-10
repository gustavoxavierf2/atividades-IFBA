import java.util.Scanner;
public class pg26lg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a_b, a_c, a_d, b_c, b_d, c_d, a_mais_b, a_mais_c, a_mais_d, b_mais_c, b_mais_d, c_mais_d;
        int A, B, C, D;

        System.out.print("Informe o valor A: ");
        A = scan.nextInt();
        System.out.print("Informe o valor B: ");
        B = scan.nextInt();
        System.out.print("Informe o valor C: ");
        C = scan.nextInt();
        System.out.print("Informe o valor D: ");
        D = scan.nextInt();

        a_b = A * B;
        a_c = A * C;
        a_d = A * D;
        b_c = B * C;
        b_d = B * D;
        c_d = C * D;

        a_mais_b = A + B;
        a_mais_c = A + C;
        a_mais_d = A + D;
        b_mais_c = B + C;
        b_mais_d = B + D;
        c_mais_d = C + D;

        System.out.println("Resultado das adiçoes: \n A + B = " + a_mais_b + "\n A + C = " + a_mais_c + "\n A + D = " + a_mais_d + 
        "\n B + C = " + b_mais_c + "\n B + D = " + b_mais_d + "\n C + D = " + c_mais_d);

        System.out.println("Resultados das multiplicaçoes : \n A x B = " + a_b + "\n A x C = " + a_c + "\n A x D = " + a_d + 
        "\n B x C = " + b_c + "\n B x D = " + b_d + "\n C x D = " + c_d);

    }
}
