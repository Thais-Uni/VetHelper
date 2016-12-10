
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
    }
    
    public void chamaControleDeClientes(CadastroDeAnimal frameAni) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?","Cancelar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                arquivoXMLCliente.leXML();
                ArrayList<Cliente> listaCliente = arquivoXMLCliente.getLista();
                arquivoXMLCliente.removeObjetoXML(listaCliente.get(listaCliente.size() - 1));
                JOptionPane.showMessageDialog(frameAni,"Cadastro cancelado!");
                frameAni.dispose();
                frameCon.setVisible(true);
            }
    }
    
    public void cadastrarAnimal(String nome, String raca, String cor, String tipo, String dono, CadastroDeAnimal frameAni) {
        if(!nome.equals("") && !raca.equals("") && !cor.equals("") && !tipo.equals("")) {
            Animal animal = new Animal(nome,raca,cor,tipo,dono);
            JOptionPane.showMessageDialog(frameAni,"Cadastro realizado com sucesso!");
            arquivoXMLAnimal.escreveXML(animal);
            frameAni.dispose();
            framePrin.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(frameAni, "Favor preencher todos os campos.");
    }
    
}
