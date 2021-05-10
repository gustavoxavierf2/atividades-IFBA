import java.util.Scanner;
public class pg26le {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float V_PRESTACAO, V_taxa, formula, atraso;

        System.out.print("digite o valor da prestaçao: ");
        V_PRESTACAO = scan.nextFloat();

        System.out.print("digite o valor da TAXA: ");
        V_taxa = scan.nextFloat();

        System.out.print("digite o tempo do ATRASO: ");
        atraso = scan.nextFloat();

        formula = V_PRESTACAO + ((V_PRESTACAO *  V_taxa/100) * atraso);

        System.out.println("valor da prestação em atraso: " + formula);


    }
    
}
