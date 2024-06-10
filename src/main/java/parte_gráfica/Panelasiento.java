package parte_gráfica;
import parte_lógica.asiento;
import javax.swing.*;
/**Panel que representa un asiento
 * @author Gustavo González
 * @version versión 1, 10 de junio 2024*/
public class Panelasiento extends JPanel {
    /**Instancia lógica del asiento*/
    private asiento a;
    /**Constructor de Panelasiento*/
    public Panelasiento(asiento a) {
        this.a = a;
    }
}