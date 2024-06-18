package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**Panel que representa una nave espacial
 * @author Gustavo González
 * @version versión 3, 17 de junio 2024*/
public class PanelNaveEspacial extends JPanel implements ActionListener {
    /**Instancia lógica de la nave espacial*/
    private NaveEspacial n;
    /**Boton que muestra el interior de la nave*/
    private JButton X;
    /***/
    private ;
    /**Constructor de PanelNaveEspacial */
    public PanelNaveEspacial(NaveEspacial n) {
        this.n = n;
        if(n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            this.setPreferredSize(new Dimension(150,733));
            this.X = new JButton("UES Contact Light");
        }
        this.add(X);
        X.setBounds(0, 0, 100, 100);
        X.addActionListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            ImageIcon UES_CONTACT_LIGHTIcon = new ImageIcon(getClass().getClassLoader().getResource("UES_Contact_Light.png"));
            g.drawImage(UES_CONTACT_LIGHTIcon.getImage(), 0, 0, null);
        }
        else if (n.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
        }
    }
}