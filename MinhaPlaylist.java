package prova;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinhaPlaylist{ //assinatura da classe
	
	
    ArrayList<String> nameMusicas = new ArrayList <String>(); //declaraçao da coleçao
    public static void main(String[] args) { //metodo principal de java, assinatura padrao
        new MinhaPlaylist().go(); //instancia objeto 
    }
    
    public void adicionaMusica(String musica){ 
        String[] lista = musica.split("/");
            nameMusicas.add(lista[0]); //split: quando encontra a "/", ele passa para a linha debaixo
    }
    public void go(){
        leMusicas();
        System.out.println("Antes de ordenar\n"+nameMusicas);
        Collections.sort(nameMusicas);
        System.out.println("Depois de ordenar\n"+nameMusicas);
    }
    
    public void leMusicas(){
        try{ // try - mais importante do codigo
            File arquivo = new File ("MinhaPlaylist.txt"); // file: arquivo-texto
            BufferedReader reader = new BufferedReader(new FileReader("MinhaPlaylist.txt")); //lê e armazena. leitor de arquivo
            String linha=null; // ser usada dentro do while
            while((linha=reader.readLine())!=null){ //leitura da linha
                adicionaMusica(linha);//metodo para adicionar musica na line

            }
        } catch(Exception ex){ //gera um erro para debugar
            ex.printStackTrace();
        }
    } 
} 
