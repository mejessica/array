package Array;

import java.util.Scanner;

public class exercicio6{
    public static void main(String[] args){
      java.util.Scanner Scanner = new java.util.Scanner(System.in);
       double[] a = new double[10];
       System.out.println("Escreva 10 valores");
        double total = 0;
        int opcao;
        
      
      for( int indice = 0; indice < a.length; indice++){
          a[indice] = Scanner.nextDouble();
          
     }
      
     do {
      for (int indice = 0; indice < 10; indice++){
        System.out.println(indice+"             "+a[indice]);
      }
      System.out.println("Escolha um indice");
      int opcaoIndice = Scanner.nextInt();
      System.out.println("Qual quantidade deseja?");
      int qntd = Scanner.nextInt();
       
      for(int i = 0; i < a.length; i++){
        if(a[i] == opcaoIndice){
        total += a[opcaoIndice] * qntd;
       }
     }
     System.out.println("O total da sua compra "+total);
     System.out.println("Gostaria de continuar comprando?");
                System.out.println("1 para sim, 2 para Nao");
                opcao = Scanner.nextInt();
     if(opcao == 2){
         System.out.println("Volte sempre");
     }          
    } while (opcao == 1);   
    
   }
    
      
 }
