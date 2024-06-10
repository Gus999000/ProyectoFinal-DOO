package parte_gráfica;
import javax.swing.*;
/**Ventana inicial de la aplicación
 * @author Gustavo González
 * @version versión 1, 10 de junio 2024*/
public class VentanaAplicación extends JFrame {
    public VentanaAplicación() {
        super();
        this.setSize(1500, 1000);
        this.setTitle("Aplicación");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}