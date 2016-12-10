package ClassesDoDominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Servico implements Serializable {
    private String nomeCliente, nomeAnimal, tipoServico, dataServico, horarioServico;
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public Servico() {
        
    }
    
    public Servico(String cliente, String animal, String tipo, String data, String horario) {
        nomeCliente = cliente;
        nomeAnimal = animal;
        tipoServico = tipo;
        dataServico = data;
        horarioServico = horario;
    }
    
    public void setNomeCliente(String cliente) {
        nomeCliente = cliente;
    }
    
    public void setNomeAnimal(String animal) {
        nomeAnimal = animal;
    }
    
    public void setTipoServico(String tipo) {
        tipoServico = tipo;
    }
    
    public void setDataServico(String data) {
        dataServico = data;
    }
    
    public void setHorarioServico(String horario) {
        horarioServico = horario;
    }
    
    public String getNomeCliente () {
        return nomeCliente;
    }
    
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    
    public String getTipoServico() {
        return tipoServico;
    }
    
    public String getDataServico() {
        return dataServico;
    }
    
    public String getHorarioServico() {
        return horarioServico;
    }
    
    public boolean verificaCliente(String cliente) {
        for(int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getNomeCliente().equals(cliente)); 
                return true;
        }
        return false;
    }
}
