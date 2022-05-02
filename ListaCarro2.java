import java.util.Scanner;
import java.util.ArrayList;

public class ListaCarro {
    public ArratList<Carro> carro = new ArrayList<Carro>();
    Scanner input = new Scanner (System.in);

    public void adicionaCarro(String nome, String marca, String modelo){
        Carro carro = new Carro (nome, marca, modelo);
        this.carro.add(carro);
    }
    public void printaCarro(){
        for(int i =0; i <=(this.carro.size()-1);i++){
            System.out.println(this.carro.get(i));
        }
    }

}