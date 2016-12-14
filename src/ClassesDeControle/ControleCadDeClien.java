package ClassesDeControle;

import ClassesDoDominio.ManipulaArquivo;
import ClassesDoDominio.Cliente;
import ClassesDoDominio.ArquivoXML;
import Telas.CadastroDeAnimal;
import Telas.CadastroDeCliente;
import Telas.ControleDeClientes;

import javax.swing.JOptionPane;

public class ControleCadDeClien {
    ControleDeClientes frameCon = new ControleDeClientes();
    CadastroDeCliente frameCad = new CadastroDeCliente();
    ManipulaArquivo arquivo = new ManipulaArquivo();
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML");
    
    public ControleCadDeClien() {
        arquivoXMLCliente.leXML();
    }
   
    public void chamaControleDeClientes(CadastroDeCliente frameCad) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar o cadastro?","Cancelar?", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frameCad, "Cliente não cadastrado.");
            frameCad.dispose();
            frameCon.setVisible(true);
        } 
    }
    
    public void chamaCadastroDeAnimal(String nome, String endereco, String email, String telefone, CadastroDeCliente frameCad) {
        if(!nome.equals("") && !endereco.equals("") && !telefone.equals("")) {
            Cliente cliente = new Cliente(nome,endereco,email,telefone);
            CadastroDeAnimal frameAni = new CadastroDeAnimal(cliente);
            frameAni.preencheDono();
            frameCad.dispose();
            frameAni.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(frameCad,"Favor preencher os campos obrigatórios.");
    }
    
}
