package Array;
import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args){
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int [] a = new int[10], b = new int[10], c = new int[10];
        
         System.out.println("Escreva 10 valores inteiros");
         for( int i = 0; i < a.length; i++){
             a[i] = teclado.nextInt();
        }
        System.out.println("\f");
        System.out.println("Escreva 10 valores inteiros");
         for( int i = 0; i < b.length; i++){
             b[i] = teclado.nextInt();
        }
         int t[] = new int [10];
        c[0]=a[0]*b[0];
        c[1]=a[1]*b[1];
        c[2]=a[2]*b[2];
        c[3]=a[3]*b[3];
        c[4]=a[4]*b[4];
        c[5]=a[5]*b[5];
        c[6]=a[6]*b[6];
        c[7]=a[7]*b[7];
        c[8]=a[8]*b[8];
        c[9]=a[9]*b[9];
        System.out.println(a[0]+" x "+b[0]+" = "+c[0]);
        System.out.println(a[1]+" x "+b[1]+" = "+c[1]);
        System.out.println(a[2]+" x "+b[2]+" = "+c[2]);
        System.out.println(a[3]+" x "+b[3]+" = "+c[3]);
        System.out.println(a[4]+" x "+b[4]+" = "+c[4]);
        System.out.println(a[5]+" x "+b[5]+" = "+c[5]);
        System.out.println(a[6]+" x "+b[6]+" = "+c[6]);
        System.out.println(a[7]+" x "+b[7]+" = "+c[7]);
        System.out.println(a[8]+" x "+b[8]+" = "+c[8]);
        System.out.println(a[9]+" x "+b[9]+" = "+c[9]);
        
    }
}
