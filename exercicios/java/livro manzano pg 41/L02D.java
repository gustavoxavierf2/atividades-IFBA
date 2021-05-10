import java.util.Scanner;
public class L02D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("nota 1 : ");
        Double nota1 = scan.nextDouble();
        System.out.print("nota 2 : ");
        Double nota2 = scan.nextDouble();
        System.out.print("nota 3 : ");
        Double nota3 = scan.nextDouble();
        System.out.print("nota 4 : ");
        Double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media < 7){
            System.out.print("Nota do exame: ");
            double notaexame = scan.nextDouble();

            double newmedia = (notaexame + media) / 2;
            if(newmedia >= 5){
            System.out.println("APROVADO COM média = " + newmedia);
            }
            else{
                System.out.println("REPROVADO COM média = " + newmedia);
            }
        }
        else{
            System.out.println("APROVADO COM média = " + media);
        }   
    }  
}
