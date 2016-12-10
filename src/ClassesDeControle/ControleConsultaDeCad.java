
package ClassesDeControle;

import ClassesDoDominio.Animal;
import ClassesDoDominio.ArquivoXML;
import ClassesDoDominio.Cliente;
import Telas.ConsultaDeCadastro;
import Telas.ControleDeClientes;
import Telas.InformacoesCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleConsultaDeCad {
    ControleDeClientes frameCon = new ControleDeClientes();
    InformacoesCliente frameInfoClien = new InformacoesCliente();
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML"); 
    ArquivoXML<Animal> arquivoXMLAnimal = new ArquivoXML<>("animais.XML");
    
    public boolean verificaCliente(String nomeDigitado) {
        arquivoXMLCliente.leXML();
        ArrayList<Cliente> lista = arquivoXMLCliente.getLista();
        for(int i=0; i < lista.size(); i++){
            String nomeCliente = lista.get(i).getNomeCliente();  
            if(nomeCliente.equals(nomeDigitado)) {
                verificaAnimal(nomeDigitado);
                frameInfoClien.preencheCadastro(lista.get(i).getNomeCliente(), lista.get(i).getEnderecoCliente(), lista.get(i).getEmailCliente(), lista.get(i).getTelefoneCliente());
                return true;
            }
        }
        return false;
    }
    
    public void verificaAnimal(String nomeDigitado) {
        arquivoXMLAnimal.leXML();
        ArrayList<Animal> lista = arquivoXMLAnimal.getLista();
        for(int i=0; i < lista.size(); i++){
            String nomeDono = lista.get(i).getNomeDono();  
            if(nomeDono.equals(nomeDigitado)) {
                frameInfoClien.preencheAnimal(lista.get(i).getNomeAnimal());
            }
        }
    }
    
    public void chamaInfoDeCliente(ConsultaDeCadastro frameConsultaCad, String nomeDigitado) {
        if(verificaCliente(nomeDigitado)) {
            frameConsultaCad.dispose();
            frameInfoClien.setVisible(true);
        }
        else 
            JOptionPane.showMessageDialog(frameConsultaCad,"Cliente não encontrado!");
    }
   
    public void chamaControleDeClientes(ConsultaDeCadastro frameConsultaCad) {
        frameConsultaCad.dispose();
        frameCon.setVisible(true);
    }
    
}
