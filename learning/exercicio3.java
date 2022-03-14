package Array;
import java.util.Scanner;

public class exercicio3{
    public static void main (String[] args){
      
       
      final int ARRAY_LENGTH = 20;
      int[] array = new int[ARRAY_LENGTH];
       
  for (int counter = 0; counter < array.length; counter++){
             array[counter] = 10 + 10 * counter;
  }
      System.out.printf("%s%8s%n","Indice","Valor");
      
      for (int counter = 0; counter < array.length; counter++){
      System.out.printf("%s%8s%n", counter , array[counter]);
      }
    } 
}  
