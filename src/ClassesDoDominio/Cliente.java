package ClassesDoDominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {
    //public static final long serialVersionUID = 1L; 
    private String nomeCliente, enderecoCliente, emailCliente, telefoneCliente;
    private ArrayList<Animal> listaAnimal = new ArrayList<>();;
    
    public Cliente() {
        
    }
    
    public Cliente(Cliente cliente) {
        nomeCliente = cliente.getNomeCliente();
        enderecoCliente = cliente.getEnderecoCliente();
        emailCliente = cliente.getEmailCliente();
        telefoneCliente = cliente.getTelefoneCliente();
    }
    
    public Cliente(String nome, String endereco, String email, String telefone) {
        nomeCliente = nome;
        enderecoCliente = endereco;
        emailCliente = email;
        telefoneCliente = telefone;
    }
    
    public Cliente(String nome, String endereco, String email, String telefone, ArrayList<Animal> animal) {
        nomeCliente = nome;
        enderecoCliente = endereco;
        emailCliente = email;
        telefoneCliente = telefone;
        //listaAnimal = animal;
    }
    
    public void setNomeCliente(String nome) {
        nomeCliente = nome;
    }
    
    public void setEnderecoCliente(String endereco) {
        enderecoCliente = endereco;
    }
    
    public void setEmailCliente(String email) {
        emailCliente = email;
    }
    
    public void setTelefoneCliente(String telefone) {
        telefoneCliente = telefone;
    }
    
    public void setListaAnimal(ArrayList<Animal> listaNovaAnimal) {
        listaAnimal = listaNovaAnimal;
    }
    
    public void addAnimal(Animal animal) {
        listaAnimal.add(animal);
        
    }
    
    public void removeAnimal(Animal animal) {
        listaAnimal.remove(animal);
    }
   
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    
    public String getEmailCliente() {
        return emailCliente;
    }
    
    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    
    public ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }
    
}


