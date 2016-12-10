package ClassesDeControle;

import Telas.Agenda;
import Telas.AgendamentoDeServico;
import Telas.ControleDeClientes;
import Telas.MenuPrincipal;

public class ControleMenuPrincipal {
    ControleDeClientes frameCon = new ControleDeClientes();
    AgendamentoDeServico frameAgen = new AgendamentoDeServico();
    Agenda frameAgenda = new Agenda(); 
    
    public void chamaControleDeClientes(MenuPrincipal framePrin) {
        framePrin.dispose();
        frameCon.setVisible(true);
    }
    
    public void chamaAgendamentoDeServico(MenuPrincipal framePrin) {
        framePrin.dispose();
        frameAgen.setVisible(true);
    }
    
    public void chamaAgenda(MenuPrincipal framePrin) {
        framePrin.dispose();
        frameAgenda.setVisible(true);
    }
    
    public void sair() {
        System.exit(0);
    }
}
