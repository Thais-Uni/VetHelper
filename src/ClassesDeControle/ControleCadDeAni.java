
package ClassesDeControle;

import ClassesDoDominio.Animal;
import ClassesDoDominio.ArquivoXML;
import ClassesDoDominio.Cliente;
import Telas.CadastroDeAnimal;
import Telas.ControleDeClientes;
import Telas.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleCadDeAni {
    ControleDeClientes frameCon = new ControleDeClientes();
    CadastroDeAnimal frameAni = new CadastroDeAnimal();
    MenuPrincipal framePrin = new MenuPrincipal();
    ArquivoXML<Animal> arquivoXMLAnimal = new ArquivoXML<>("animais.XML");
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML"); 
    
    public ControleCadDeAni() {
       arquivoXMLAnimal.leXML();
       arquivoXMLCliente.leXML();
       
    }
    
    public Cliente retornaObjeto(ArrayList<Cliente> listaCliente, String str) {
        Cliente cliente = null;
        for(int i = 0; i < listaCliente.size(); i ++) {
            if(listaCliente.get(i).getNomeCliente().equals(str)) {
                cliente = listaCliente.get(i);
                break;
            }
        }
        return cliente;
    }
    
    public void chamaControleDeClientes(CadastroDeAnimal frameAni, String dono) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?","Cancelar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                ArrayList<Cliente> listaCliente = arquivoXMLCliente.getLista();
                arquivoXMLCliente.escreveXML(retornaObjeto(listaCliente, dono),false);
                JOptionPane.showMessageDialog(frameAni,"Cadastro cancelado!");
                frameAni.dispose();
                frameCon.setVisible(true);
            }
    }
    
    public void cadastrarAnimal(String nome, String raca, String cor, String tipo, Cliente cliente, CadastroDeAnimal frameAni) {
        if(!nome.equals("") && !raca.equals("") && !cor.equals("") && !tipo.equals("")) {
            Animal animal = new Animal(nome,raca,cor,tipo);
            cliente.addAnimal(animal);
            arquivoXMLCliente.escreveXML(cliente, true);
            arquivoXMLAnimal.escreveXML(animal,true);
            JOptionPane.showMessageDialog(frameAni,"Cadastro realizado com sucesso!");
            frameAni.dispose();
            framePrin.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(frameAni, "Favor preencher todos os campos.");
    }
    
}



/*arquivoXMLCliente.leXML();
            ArrayList<Cliente> listaCliente = arquivoXMLCliente.getLista();
            Cliente cliente = retornaObjeto(listaCliente, dono);
            cliente.addAnimal(animal); cliente.setAnimal(cliente.getListaAnimal());
            Cliente cliente2 = new Cliente(cliente.getNomeCliente(), cliente.getEnderecoCliente(), cliente.getEmailCliente(), cliente.getTelefoneCliente(),cliente.getListaAnimal());
            arquivoXMLCliente.escreveXML(cliente,false);
            arquivoXMLCliente.leXML();
            arquivoXMLCliente.escreveXML(cliente2,true);
            */