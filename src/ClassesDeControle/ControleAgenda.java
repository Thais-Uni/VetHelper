
package ClassesDeControle;

import Telas.Agenda;
import Telas.MenuPrincipal;


public class ControleAgenda {
    MenuPrincipal framePrin = new MenuPrincipal();
    
    public void chamaMenuPrincipal(Agenda frameAgenda) {
        frameAgenda.dispose();
        framePrin.setVisible(true);
    }
    
}
