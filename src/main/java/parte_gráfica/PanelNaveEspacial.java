package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;

/**Panel que representa una nave espacial
 * @author Gustavo González
 * @version versión 2, 17 de junio 2024*/
public class PanelNaveEspacial extends JPanel {
    /***/
    private NaveEspacial n;
    public PanelNaveEspacial(NaveEspacial n) {
        this.n = n;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(n.get == ) {
            this.setBackground(Color.green);
        }
        else if () {
            this.setBackground(Color.red);
        }
    }
}