
package ClassesDeControle;

import ClassesDoDominio.Animal;
import ClassesDoDominio.ArquivoXML;
import ClassesDoDominio.Cliente;
import Telas.CadastroDeAnimal;
import Telas.ControleDeClientes;
import Telas.MenuPrincipal;
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
        
    public void chamaControleDeClientes(CadastroDeAnimal frameAni, String dono) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?","Cancelar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(frameAni,"Cadastro não realizado!");
                frameAni.dispose();
                frameCon.setVisible(true);
            }
    }
    
    public void cadastrarAnimal(String nome, String raca, String cor, String tipo, Cliente cliente, CadastroDeAnimal frameAni) {
        if(!nome.equals("") && !raca.equals("") && !cor.equals("") && !tipo.equals("")) {
            Animal animal = new Animal(nome,raca,cor,tipo);
            cliente.addAnimal(animal);
            System.out.println(cliente.getListaAnimal().get(0).getNomeAnimal()); //só para testar se o animal está sendo add ao arraylist do cliente
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
