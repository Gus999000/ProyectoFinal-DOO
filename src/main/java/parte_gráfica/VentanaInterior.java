package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
/**Ventana que representa el interior de las naves espaciales
 * @author Gustavo González
 * @version versión 3, 05 de julio 2024*/
public class VentanaInterior extends JFrame {
    /**Constructor de VentanaInterior*/
    public VentanaInterior(NaveEspacial n, int Z) {
        this.setLayout(new BorderLayout());
        if(n.getModelo() == Modelos.APOLO_11.getmodelo()) {
            this.setSize(760, 570);
            this.setTitle("Apolo 11");
            this.add(new PanelInterior(n, Z), BorderLayout.CENTER);
        }
        else if (n.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
            this.setSize(750, 594);
            this.setTitle("Arca del Vacío");
            this.add(new PanelInterior(n, Z), BorderLayout.CENTER);
        }
        else if (n.getModelo() == Modelos.HALCÓN_MILENARIO.getmodelo()) {
            this.setSize(750, 500);
            this.setTitle("Halcón Milenario");
            this.add(new PanelInterior(n, Z), BorderLayout.CENTER);
        }
        else if (n.getModelo() == Modelos.MORNING_STAR.getmodelo()) {
            this.setSize(750, 481);
            this.setTitle("Morning Star");
            this.add(new PanelInterior(n, Z), BorderLayout.CENTER);
        }
        else if (n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            this.setSize(499, 261);
            this.setTitle("UES Contact Light ");
            this.add(new PanelInterior(n, Z), BorderLayout.CENTER);
        }
    }
}