package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
/**Ventana que muestra información de un asiento
 * @author Gustavo González
 * @version versión 1, 05 de julio 2024*/
public class VentanaAsiento extends JFrame {
    /**Constructor de VentanaAsiento
     * @param a Asiento
     * @param X JButton*/
    public VentanaAsiento(Asiento a, JButton X) {
        this.setLayout(new BorderLayout());
        this.setSize(200, 200);
        this.setTitle(String.valueOf(a.getNúmero()));
        this.add(new PanelVentanaAsiento(a, X), BorderLayout.CENTER);
    }
}