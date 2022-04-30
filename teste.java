

import java.util.ArrayList;
import java.util.List;

public class array {

public static void main (String [] args) {
    final int max = 2000; 
    long tInicio = System.currentTimeMillis();
    List<Integer> lista= new ArrayList <Integer> ();
    
        for(int i = 0; i<max; i++){
            lista.add(i); //percorre a lista e add
        }
        for (int i =0; i<max; i++){
            lista.contains(i); // percorre a lista vendo o que contem na lista/array
        }
        long tFim=System.currentTimeMillis(); //tempo que demorou para pecorrer o algoritmo
        System.out.println("Tempo total; "+ (tFim - tInicio));
}
}
