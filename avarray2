package Array;

import java.util.Scanner;
public class avjava2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int menu = 0, i = 0, cod = 0, qtdBala = 0, qtdChic = 0, qtdChoc = 0, qtdLar = 0, qtdUva = 0, qtdSand = 0;
        double valorBala = 0, valorChic = 0, valorChoc = 0, valorLar = 0, valorUva = 0, valorSand = 0;

        System.out.println("--------Catalogo de produtos--------");
        System.out.println("Codigo *** Nome ******** Preco em R$");
        System.out.println("0        Balas            R$0,20");
        System.out.println("1        Chicletes        R$0,30");
        System.out.println("2        Chocolates       R$2,00");
        System.out.println("3        Suco de Laranja  R$5,00");
        System.out.println("4        Suco de Uva      R$6,00");
        System.out.println("5        Sanduiche         R$10,00");

        for(menu = 4; menu != 0;){
            System.out.println("MENU: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Vender Produto");
            System.out.println("2 - Quantidade vendida no dia por produto em REAIS");
            System.out.println("3 - Quantidade vendida no dia por produto em UNIDADES");
            menu = input.nextInt();

            if(menu == 1){  
                System.out.println();
                for(i = 0; i < 4; i++){
                    System.out.print("Digite o codigo do produto: ");
                    cod = input.nextInt();

                    if(cod == 0){
                        valorBala += 0.20;
                        qtdBala++;
                    }
                    else if(cod == 1){
                        valorChic += 0.30;
                        qtdChic++;
                    }
                    else if(cod == 2){
                        valorChoc+= 2.00;
                        qtdChoc++;
                    }
                    else if(cod == 3){
                        valorLar += 5.00; 
                        qtdLar++;
                    } 
                    else if(cod == 4){
                        valorUva += 6.00; 
                        qtdUva++;
                    }
                    else if(cod == 5){
                        valorSand += 10.00; 
                        qtdSand++;
                    }
                }
            }
            else if(menu == 2){ 
                System.out.println("\nA quantidade de produtos reais:\nBalas: R$"+valorBala+" \nChiclete: R$"+valorChic+" \nChocolates: R$"+valorChoc+" \nSuco de Uva: R$"+valorUva+" \nSuco de Laranja: R$"+valorLar+" \nSanduiche: R$"+valorSand+" ");
            } 
            else if(menu == 3){ 
                System.out.println("\nA quantidade de produtos unidades:\nBalas: "+qtdBala+" \nChiclete: "+qtdChic+" \nChocolates: "+qtdChoc+" \nSuco de Uva: "+qtdUva+" \nSuco de Laranja: "+qtdLar+" \nSanduiche: "+qtdSand+" ");
            }                
        }
    }
}
