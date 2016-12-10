package ClassesDeControle;

import ClassesDoDominio.ArquivoXML;
import ClassesDoDominio.Cliente;
import ClassesDoDominio.Servico;
import Telas.AgendamentoDeServico;
import Telas.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleAgenDeServ {
    MenuPrincipal framePrin = new MenuPrincipal();
    AgendamentoDeServico frameAgen = new AgendamentoDeServico();
    ArquivoXML<Servico> arquivoXMLServico = new ArquivoXML<>("servicos.XML");
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML");
    
    public ControleAgenDeServ() {
        arquivoXMLServico.leXML();
    }
 
    public boolean verificaCliente(String nomeDigitado) {
        arquivoXMLCliente.leXML();
        ArrayList<Cliente> lista = arquivoXMLCliente.getLista();
        for(int i=0; i < lista.size(); i++){
            String nomeCliente = lista.get(i).getNomeCliente();  
            if(nomeCliente.equals(nomeDigitado)) {
                return true;
            }
        }
        return false;
    }
    
    public void cancelaAgendamento(AgendamentoDeServico frameAgen) {
        frameAgen.dispose();
        framePrin.setVisible(true);
    }
    
    public void confirmaAgendamento(String dono, String animal, String tipo, String data, String horario, AgendamentoDeServico frameAgen) {
        if(!verificaCliente(dono))
            JOptionPane.showMessageDialog(frameAgen, "Cliente não encontrado!");
        else if(animal.equals("") || dono.equals("") ) {
            JOptionPane.showMessageDialog(frameAgen,"Favor preencher todos os campos.");
            
        }else {
            Servico servico = new Servico(dono,animal,tipo,data,horario);
            arquivoXMLServico.escreveXML(servico);
            JOptionPane.showMessageDialog(frameAgen,"Serviço agendado com sucesso!");
            cancelaAgendamento(frameAgen);
        }
            
    }
    
}
