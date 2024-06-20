package parte_gráfica;
import javax.swing.*;
import java.awt.*;
/**Ventana inicial de la aplicación
 * @author Gustavo González
 * @version versión 4, 20 de junio 2024*/
public class VentanaAplicación extends JFrame {
    /**Constructor de VentanaAplicación*/
    public VentanaAplicación() {
        super();
        this.setSize(1920, 1080);
        this.setTitle("Aplicación");
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal(), BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}