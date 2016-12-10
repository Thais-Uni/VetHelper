package ClassesDoDominio;

import java.util.ArrayList;

public class Cliente {
    private String nomeCliente, enderecoCliente, emailCliente, telefoneCliente;
    private ArrayList<Animal> listaAnimal= new ArrayList<Animal>();
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, String endereco, String email, String telefone) {
        nomeCliente = nome;
        enderecoCliente = endereco;
        emailCliente = email;
        telefoneCliente = telefone;
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


