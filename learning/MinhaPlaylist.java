import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MinhaPlaylist{ //assinatura da classe
    ArrayList<String> nameMusicas = new ArrayList <String>(); //declaraçao da coleçao
    public static void main(String[] args) { //metodo principal de java, assinatura padrao
        new MinhaPlaylist() .leMusicas(); //instancia objeto 
    }
    public void adicionaMusica(String musica){ 
        String[] lista = musica.split("/");
            nameMusicas.add(lista[0]); //split: quando encontra a "/", ele passa para a linha debaixo
    }
    public void go(){
        leMusicas();
        System.out.println(nameMusicas);
    }
    
    public void leMusicas(){
        try{
            File arquivo = new File ("MinhaPlaylist.txt");
            BufferedReader reader = new BufferedReader(new FileReader(arquivo)); //lê e armazena 
            String linha=null;
            while((linha=reader.readLine())!=null){
                adicionaMusica(linha);

            }
        } catch(Exception ex){ //gera um erro
            ex.printStackTrace();
        }
    } 
} 
