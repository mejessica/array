import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MinhaPlaylist{
    ArrayList<String> nameMusicas = new ArrayList <String>();
    public static void main(String[] args) {
        
    }
    public void adicionaMusica(String musica){
        String[] lista = musica.split("/");
            nameMusicas.add(lista[0]); //split: quando encontra a "/", ele passa para a linha debaixo
    }
    public void leMusicas(){
        try{
            File arquivo = new File ("Listas_Musicas");
            BufferedReader reader = new BufferedReader(new FileReader(arquivo)); 
            String linha=null;
            while((linha=reader.readLine())!=null){
                adicionaMusica(linha);

            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    } 
} 
