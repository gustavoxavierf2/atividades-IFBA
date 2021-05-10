import java.util.Scanner;
public class pg26lf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A, B, C;

        System.out.print("1 - digite um nome qualquer: ");
        A = scan.nextLine();

        System.out.print("\n2 - digite um nome qualquer: ");
        B = scan.nextLine();

        //INVESAO
        C = A;
        A = B;
        B = C;

        System.out.println("\n\nImprima " + B + ": " + A);
        System.out.println("Imprima " + A + ": " + B);

    }
    
}
