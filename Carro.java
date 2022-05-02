public class Carro{
    private String marca;
    private String modelo;
    private String nome;


    public Carro (String nome, String marca, String modelo){
        this.nome=nome;
        this.marca=marca;
        this.modelo=modelo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getNome(){
        return this.nome;
    }
    public String getMarca(){
        return this.marca;
    }
    public String setModelo(){
        return this.modelo;
    }

    @Override
    public String toString(){
        return "Carro [nome="+nome+", marca=" +marca+", modelo:" +modelo+"]";    }
}