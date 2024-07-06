package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**Panel que representa un asiento
 * @author Gustavo González
 * @version versión 6, 05 de julio 2024*/
public class PanelAsiento extends JPanel implements ActionListener {
    /**Instancia lógica del asiento*/
    private Asiento a;
    /**Botón que abre la ventana con la información del asiento*/
    private JButton X;
    /**Ventana que muestra información del asiento*/
    private VentanaAsiento I;
    /**Constructor de PanelAsiento
     * @param a Asiento*/
    public PanelAsiento(Asiento a) {
        this.a = a;
        this.setLayout(null);
        this.setPreferredSize(new Dimension(50,50));
        this.X = new JButton(String.valueOf(a.getNúmero()));
        X.setBounds(0, 0, 50, 50);
        X.setBackground(Color.GREEN);
        this.add(X);
        X.addActionListener(this);
        this.I = new VentanaAsiento(a, X);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == X) {
            this.I.setVisible(true);
        }
    }
}