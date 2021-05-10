import java.util.Scanner;

public class L02L {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String num;
       char sexo;
        System.out.print("digite um numero: ");
        num = scan.nextLine();
        System.out.print("qual se sexo [M/F]");
        sexo = scan.nextLine();

        if(sexo == "M" || sexo == "m")
        {
            System.out.println("Ilmo Sr."+ num);
        }
        if(sexo == "F" || sexo == "f")
        {
            System.out.println("Ilmo Sra."+ num);
        }
        else
        {
            System.out.println("Informe um genero valido");
        }
    }
    
}
