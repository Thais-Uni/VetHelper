
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
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML");
    ArquivoXML<Animal> arquivoXMLAnimal = new ArquivoXML<>("animais.XML");
    
    public ControleInfoDeCliente() {
        arquivoXMLCliente.leXML();
        arquivoXMLAnimal.leXML();
    }
    
    public void chamaConsultaDeCadastro(InformacoesCliente frameInfoClien) {
        frameInfoClien.dispose();
        ConsultaDeCadastro frameConsuCad = new ConsultaDeCadastro();
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
    
    public void excluiAnimal(ArrayList<Animal> listaAnimalXML, ArrayList<Animal> listaAnimalCliente) {
        for(int i = 0; i < listaAnimalXML.size(); i ++) {
                for(int j = 0; j < listaAnimalCliente.size(); j++) {
                    if(listaAnimalCliente.get(j).getNomeAnimal().equals(listaAnimalXML.get(i).getNomeAnimal()))
                        arquivoXMLAnimal.escreveXML(listaAnimalXML.get(i), false);
                }
            }
    }
    
    public void excluiCadastroCliente(String nomeDigitado,InformacoesCliente frameInfoClien) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o cadastro do cliente?","Excluir?", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Cliente cliente = retornaCliente(nomeDigitado);
            ArrayList<Animal> listaAnimalCliente = cliente.getListaAnimal();
            ArrayList<Animal> listaAnimalXML = arquivoXMLAnimal.getLista();
            for(int i = 0; i < listaAnimalXML.size(); i ++) {
                for(int j = 0; j < listaAnimalCliente.size(); j++) {
                    if(listaAnimalCliente.get(j).getNomeAnimal().equals(listaAnimalXML.get(i).getNomeAnimal()))
                        arquivoXMLAnimal.escreveXML(listaAnimalXML.get(i), false);
                }
            }
            arquivoXMLCliente.escreveXML(cliente, false);
            JOptionPane.showMessageDialog(frameInfoClien,"Cadastro de cliente excluído com sucesso!");
            frameInfoClien.dispose();
            ControleDeClientes frameCon = new ControleDeClientes();
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
    
    public void removeAnimal(InformacoesCliente frameInfoClien, int quant, String nomeCliente, String nomeAnimal) {
        if(quant <= 1)
            JOptionPane.showMessageDialog(frameInfoClien,"Não é possível remover o animal!");
        else {
            Cliente cliente = retornaCliente(nomeCliente);
            ArrayList<Animal> listaAnimal = cliente.getListaAnimal();
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
