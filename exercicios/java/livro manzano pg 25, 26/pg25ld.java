import java.util.Scanner;

public class pg25ld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("digite a velocidade  media do veiculo: ");
        Float veloc_media = scan.nextFloat();

        System.out.print("digite a duraçao da viagem em minutos: ");
        Float durac_viagem = scan.nextFloat();

        Float distancia = veloc_media * durac_viagem;
        
        Float combustivel_gasto = distancia/12;
        System.out.println("distancia: " + distancia);
        System.out.println("velocidade  media: " + veloc_media);
        System.out.println("duraçao da viagem: " + durac_viagem);
        System.out.println("total do combustivel gasto durante a viagem: " + combustivel_gasto);

    }
    
}
