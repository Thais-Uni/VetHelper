package ClassesDoDominio;

public class Animal {
    private String nomeAnimal, racaAnimal, corAnimal, tipoAnimal, nomeDono;
    
    public Animal() {
        
    }
    
    public Animal(String nome, String raca, String cor, String tipo, String dono) {
        nomeAnimal = nome;
        racaAnimal = raca;
        corAnimal = cor;
        tipoAnimal = tipo;
        nomeDono = dono;
    }
    
    public void setNomeAnimal(String nome) {
        nomeAnimal = nome;
    }
    
    public void setRacaAnimal(String raca) {
        racaAnimal = raca;
    }
    
    public void setCorAnimal(String cor) {
        corAnimal = cor;
    }
    
    public void setTipoAnimal(String tipo) {
        tipoAnimal = tipo;
    }
    
    public void setNomeDono(String dono) {
        nomeDono = dono;
    }
    
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    
    public String getRacaAnimal() {
        return racaAnimal;
    }
    
    public String getCorAnimal() {
        return corAnimal;
    }
    
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    
    public String getNomeDono() {
        return nomeDono;
    }
    
}
