package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**Panel que representa un asiento
 * @author Gustavo González
 * @version versión 5, 03 de julio 2024*/
public class PanelAsiento extends JPanel implements ActionListener {
    /**Instancia lógica del asiento*/
    private Asiento a;
    /***/
    private JButton X;
    /**Constructor de Panelasiento
     * @param a Asiento*/
    public PanelAsiento(Asiento a) {
        this.a = a;
        this.setPreferredSize(new Dimension(50,50));
        this.X = new JButton(String.valueOf(a.getNúmero()));
        this.add(X);
    }
    /**Método que cambia la disponibilidad a "no disponible", revalida el panel y lo repinta*/
    public void reservarPanel() {
        this.a.reservar();
        this.revalidate();
        this.repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(a.getDisponibilidad() == true) {
            this.setBackground(Color.green);
        }
        else {
            this.setBackground(Color.red);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == X) {
        }
    }
}