
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
    CadastroDeAnimal frameCadAni = new CadastroDeAnimal();
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
    
    public void excluirCadastro(String nomeDigitado,InformacoesCliente frameInfoClien) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o cadastro do cliente?","Excluir?", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            ArrayList<Cliente> listaCliente = arquivoXMLCliente.getLista();
            for(int i = 0; i < listaCliente.size(); i++){
                String nomeCliente = listaCliente.get(i).getNomeCliente();  
                if(nomeCliente.equals(nomeDigitado)) {
                    arquivoXMLCliente.escreveXML(listaCliente.get(i),false);
                    ArrayList<Animal> listaAnimal = listaCliente.get(i).getListaAnimal();
                    for(int j = 0; j < listaAnimal.size(); j ++)
                        arquivoXMLAnimal.escreveXML(listaAnimal.get(j), true);
                    JOptionPane.showMessageDialog(frameInfoClien,"Cadastro de cliente excluído com sucesso!");
                    frameInfoClien.dispose();
                    frameCon.setVisible(true);
                    break;
                }
            }
        }
    }
    
    public void adicionarAnimal(InformacoesCliente frameInfoClien, String dono) {
        frameCadAni.preencheDono(dono);
        frameInfoClien.dispose();
        frameCadAni.setVisible(true);
    }
    
    public void removerAnimal(InformacoesCliente frameInfoClien, Cliente cliente) {
        ArrayList<Animal> listaAnimal = cliente.getListaAnimal();
        if(listaAnimal.size() == 1) 
            JOptionPane.showMessageDialog(frameInfoClien,"Não é possível remover o animal!");
        else {
            for(int i = 0; i < listaAnimal.size(); i ++)
                arquivoXMLAnimal.escreveXML(listaAnimal.get(i), false);
            JOptionPane.showMessageDialog(frameInfoClien,"Animal removido com sucesso!");
        }
    }
    
}
