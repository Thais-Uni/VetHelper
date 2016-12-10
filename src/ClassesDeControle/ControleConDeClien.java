package ClassesDeControle;

import Telas.CadastroDeCliente;
import Telas.ConsultaDeCadastro;
import Telas.ControleDeClientes;
import Telas.MenuPrincipal;

public class ControleConDeClien {
    MenuPrincipal framePrin = new MenuPrincipal();
    CadastroDeCliente frameCadCli = new CadastroDeCliente();
    ConsultaDeCadastro frameConsuCad = new ConsultaDeCadastro();
    
    public void chamaMenuPrincipal(ControleDeClientes frameCon) {
        frameCon.dispose();
        framePrin.setVisible(true);
    }
    
    public void chamaCadastroDeCliente(ControleDeClientes frameCon) {
        frameCon.dispose();
        frameCadCli.setVisible(true);
    }
    
    public void chamaConsultaDeCadastro(ControleDeClientes frameCon) {
        frameCon.dispose();
        frameConsuCad.setVisible(true);
    }
}
