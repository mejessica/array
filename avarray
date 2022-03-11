package Array;
import java.util.Scanner;
public class av {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\f");
        double preco[] = {0.20, 0.30, 2, 5, 6, 10};
        int quantidade[] = new int [6];
        double valorTotal[] = new double [6];
        int menu = 0;
        int cod;
        do {
        System.out.println(" ");
        System.out.println("MENU: ");
        System.out.println("0 - Sair");
        System.out.println("1 - Vender Produto");
        System.out.println("2 - Quantidade vendida no dia por produto em REAIS");
        System.out.println("3 - Quantidade vendida no dia por produto em UNIDADES");
        menu = input.nextInt();
        if (menu == 1) {
            System.out.println(" ");
            System.out.println("--------Catalogo de produtos--------");
            System.out.println("Codigo * Nome ** Preco em R$");
            System.out.println("0        Balas            R$0,20");
            System.out.println("1        Chicletes        R$0,30");
            System.out.println("2        Chocolates       R$2,00");
            System.out.println("3        Suco de Laranja  R$5,00");
            System.out.println("4        Suco de Uva      R$6,00");
            System.out.println("5        Sanduiche         R$10,00");
            System.out.println("Digite o codigo do produto que deseja comprar");
            cod = input.nextInt();
            System.out.println("Digite a quantidade");
            quantidade[cod] = input.nextInt();
            valorTotal[cod] = preco[cod]*quantidade[cod];
            
        } if (menu == 2){
           
            System.out.println("Quantidade vendido no dia por produto em reais:");
            System.out.println(" ");
            System.out.println("Balas: "+quantidade[0]*preco[0]);
            System.out.println("Chicletes: "+quantidade[1]*preco[1]);
            System.out.println("Chocolates: "+quantidade[2]*preco[2]);
            System.out.println("Suco de Laranja: "+quantidade[3]*preco[3]);
            System.out.println("Suco de Uva: "+quantidade[4]*preco[4]);
            System.out.println("Sanduiche: "+quantidade[5]*preco[5]);
            
        } if (menu == 3){
          
            System.out.println("Quantidade vendido no dia por produto em unidades");
            System.out.println(" ");
            System.out.println("Balas: "+quantidade[0]);
            System.out.println("Chicletes: "+quantidade[1]);
            System.out.println("Chocolates: "+quantidade[2]);
            System.out.println("Suco de Laranja: "+quantidade[3]);
            System.out.println("Suco de Uva: "+quantidade[4]);
            System.out.println("Sanduiche: "+quantidade[5]);
        } if (menu == 0){
            System.out.println("Obrigada pela compra!");
        }
    } while (menu != 0);
        
    }
}
