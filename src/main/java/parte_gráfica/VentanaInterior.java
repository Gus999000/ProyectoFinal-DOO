package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
/**Ventana que representa el interior de las naves espaciales
 * @author Gustavo González
 * @version versión 1, 28 de junio 2024*/
public class VentanaInterior extends JFrame {
    /**Constructor de VentanaInterior*/
    public VentanaInterior(NaveEspacial n) {
        this.setLayout(null);
        if(n.getModelo() == Modelos.APOLO_11.getmodelo()) {
            this.setSize(300, 900);
            this.setTitle("Apolo 11");
        }
        else if (n.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
            this.setSize(600, 500);
            this.setTitle("Arca del Vacío");
        }
        else if (n.getModelo() == Modelos.HALCÓN_MILENARIO.getmodelo()) {
            this.setSize(800, 600);
            this.setTitle("Halcón Milenario");
        }
        else if (n.getModelo() == Modelos.MORNING_STAR.getmodelo()) {
            this.setSize(900, 900);
            this.setTitle("Morning Star");
        }
        else if (n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            this.setSize(300, 600);
            this.setTitle("UES Contact Light ");
        }
    }
}