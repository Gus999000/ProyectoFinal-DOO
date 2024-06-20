package parte_gráfica;
import javax.swing.*;
import java.awt.*;
/**Ventana inicial de la aplicación
 * @author Gustavo González
 * @version versión 3, 19 de junio 2024*/
public class VentanaAplicación extends JFrame {
    public VentanaAplicación() {
        super();
        this.setSize(2000, 1000);
        this.setTitle("Aplicación");
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal(), BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}