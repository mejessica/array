package Array;

import java.util.Scanner;
public class exercicio2{
    public static void main (String[] args){
       Scanner teclado= new java.util.Scanner(System.in);
        
        double array[] = new double[4];
        System.out.println("Digite quatro valores");
        array[0] = teclado.nextDouble();
        array[1] = teclado.nextDouble();
        array[2] = teclado.nextDouble();
        array[3] = teclado.nextDouble();
     
        
        double sum = array[0] + array[2];
        double sub = array[3] - array[1];
        double x = array[2] * array[1];
      
         System.out.println("Soma dos arrays 1 e 3: "+sum);
        System.out.println("Subtracao dos array 4 e 2: "+sub);
        System.out.println("Multiplicacao dos arays 3 e 2: "+x);
    }
}
