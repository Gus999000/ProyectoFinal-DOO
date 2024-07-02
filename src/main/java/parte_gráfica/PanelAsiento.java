package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
/**Panel que representa un asiento
 * @author Gustavo González
 * @version versión 4, 01 de julio 2024*/
public class PanelAsiento extends JPanel {
    /**Instancia lógica del asiento*/
    private Asiento a;
    /**Constructor de Panelasiento
     * @param a Asiento*/
    public PanelAsiento(Asiento a) {
        this.a = a;
        this.setPreferredSize(new Dimension(100,100));
        this.add(new JLabel(String.valueOf(a.getNúmero())));
    }
    /**Método que cambia la disponibilidad a "no disponible", revalida el panel y lo repinta*/
    public void reservarPanel() {
        this.a.reservar();
        revalidate();
        repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(a.getDisponibilidad() == true) {
            this.setBackground(Color.green);
        }
        else if (a.getDisponibilidad() == false) {
            this.setBackground(Color.red);
        }
    }
}