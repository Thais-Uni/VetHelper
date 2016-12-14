
package ClassesDeControle;

import ClassesDoDominio.Animal;
import ClassesDoDominio.ArquivoXML;
import ClassesDoDominio.Cliente;
import Telas.CadastroDeAnimal;
import Telas.ConsultaDeCadastro;
import Telas.ControleDeClientes;
import Telas.InformacoesCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControleInfoDeCliente {
    ConsultaDeCadastro frameConsuCad = new ConsultaDeCadastro();
    ControleDeClientes frameCon = new ControleDeClientes();
    
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML");
    ArquivoXML<Animal> arquivoXMLAnimal = new ArquivoXML<>("animais.XML");
    
    public ControleInfoDeCliente() {
        arquivoXMLCliente.leXML();
        arquivoXMLAnimal.leXML();
    }
    
    public void chamaConsultaDeCadastro(InformacoesCliente frameInfoClien) {
        frameInfoClien.dispose();
        frameConsuCad.setVisible(true);
    }
    
    public Cliente retornaCliente(String nomeDigitado) {
        int i;
        ArrayList<Cliente> listaCliente = arquivoXMLCliente.getLista();
        for(i = 0; i < listaCliente.size(); i++){
            String nomeCliente = listaCliente.get(i).getNomeCliente();  
            if(nomeCliente.equals(nomeDigitado)) 
                break;
        }
        return listaCliente.get(i);
    }
    
    public void excluiCadastroCliente(String nomeDigitado,InformacoesCliente frameInfoClien) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o cadastro do cliente?","Excluir?", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Cliente cliente = retornaCliente(nomeDigitado);
            ArrayList<Animal> listaAnimal = cliente.getListaAnimal();
            for(int i = 0; i < listaAnimal.size(); i ++)
                arquivoXMLAnimal.escreveXML(listaAnimal.get(i), false);
            arquivoXMLCliente.escreveXML(cliente,false);
            JOptionPane.showMessageDialog(frameInfoClien,"Cadastro de cliente excluído com sucesso!");
            frameInfoClien.dispose();
            frameCon.setVisible(true);
        }
    }
    
    public void adicionaAnimal(InformacoesCliente frameInfoClien, String dono) {
        Cliente cliente = retornaCliente(dono);
        CadastroDeAnimal frameCadAni = new CadastroDeAnimal(cliente);
        frameCadAni.preencheDono(dono);
        frameInfoClien.dispose();
        frameCadAni.setVisible(true);
    }
    
    public void removeAnimal(InformacoesCliente frameInfoClien, int quant, String nomeAnimal) {
        if(quant == 1)
            JOptionPane.showMessageDialog(frameInfoClien,"Não é possível remover o animal!");
        else {
            ArrayList<Animal> listaAnimal = arquivoXMLAnimal.getLista();
            for(int i = 0; i < listaAnimal.size(); i ++) {
                if(listaAnimal.get(i).getNomeAnimal().equals(nomeAnimal)) {
                    arquivoXMLAnimal.escreveXML(listaAnimal.get(i), false);
                    break;
                }
            }
        JOptionPane.showMessageDialog(frameInfoClien,"Animal removido com sucesso!");
        }
    }
    
}
