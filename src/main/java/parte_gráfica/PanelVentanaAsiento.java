package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**Panel que muestra información de un asiento
 * @author Gustavo González
 * @version versión 1, 05 de julio 2024*/
public class PanelVentanaAsiento extends JPanel implements ActionListener {
    /**Instancia lógica del asiento*/
    private Asiento a;
    /**Botón para reservar*/
    private JButton R;
    /**Botón con el que se abrió la ventana*/
    private JButton X;
    /**Constructor de PanelVentanaAsiento
     * @param a Asiento
     * @param X JButton*/
    public PanelVentanaAsiento(Asiento a, JButton X) {
        this.a = a;
        this.X = X;
        this.setLayout(null);
        this.R = new JButton("Reservar");
        R.setBounds(0, 100, 200, 50);
        this.add(R);
        R.addActionListener(this);
        JLabel C = new JLabel("Categoría: " + a.getCategoría());
        C.setForeground(Color.black);
        this.add(C);
        C.setBounds(0, 0, 200, 50);
        JLabel P = new JLabel("Precio: " + a.getPrecio());
        P.setForeground(Color.black);
        this.add(P);
        P.setBounds(0, 50, 200, 50);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == R) {
            a.reservar();
            X.setBackground(Color.RED);
            revalidate();
            repaint();
        }
    }
}