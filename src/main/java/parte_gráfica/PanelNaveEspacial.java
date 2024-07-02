package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**Panel que representa una nave espacial
 * @author Gustavo González
 * @version versión 9, 02 de julio 2024*/
public class PanelNaveEspacial extends JPanel implements ActionListener {
    /**Instancia lógica de la nave espacial*/
    private NaveEspacial N;
    /**Boton que muestra el interior de la nave*/
    private JButton X;
    /**Ventana que representa el interior de las naves espaciales*/
    private VentanaInterior Interior;
    /**Constructor de PanelNaveEspacial, es creado acorde al tipo de nave que reciba
     * @param n NaveEspacial*/
    public PanelNaveEspacial(NaveEspacial n) {
        this.N = n;
        this.setLayout(null);
        if(n.getModelo() == Modelos.APOLO_11.getmodelo()) {
            this.setPreferredSize(new Dimension(395,500));
            this.X = new JButton(Modelos.APOLO_11.getmodelo());
            this.add(X);
            X.setBounds(10, 10, 100, 20);
            JLabel H = new JLabel(n.getHorario());
            H.setForeground(Color.black);
            H.setOpaque(true);
            H.setBackground(Color.white);
            this.add(H);
            H.setBounds(10, 35, 60, 25);
            JLabel H1 = new JLabel(n.getHorario1());
            H1.setForeground(Color.black);
            H1.setOpaque(true);
            H1.setBackground(Color.white);
            this.add(H1);
            H1.setBounds(10, 65, 60, 25);
            JLabel H2 = new JLabel(n.getHorario2());
            H2.setForeground(Color.black);
            H2.setOpaque(true);
            H2.setBackground(Color.white);
            this.add(H2);
            H2.setBounds(10, 95, 60, 25);
            JLabel R = new JLabel(n.getRecorrido());
            R.setForeground(Color.black);
            R.setOpaque(true);
            R.setBackground(Color.white);
            this.add(R);
            R.setBounds(10, 125, 35, 25);
        }
        else if (n.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
            this.setPreferredSize(new Dimension(257,246));
            this.X = new JButton(Modelos.ARCA_DEL_VACÍO.getmodelo());
            this.add(X);
            X.setBounds(5, 20, 140, 16);
            JLabel H = new JLabel(n.getHorario());
            H.setForeground(Color.black);
            H.setOpaque(true);
            H.setBackground(Color.white);
            this.add(H);
            H.setBounds(5, 45, 60, 25);
            JLabel H1 = new JLabel(n.getHorario1());
            H1.setForeground(Color.black);
            H1.setOpaque(true);
            H1.setBackground(Color.white);
            this.add(H1);
            H1.setBounds(5, 75, 60, 25);
            JLabel H2 = new JLabel(n.getHorario2());
            H2.setForeground(Color.black);
            H2.setOpaque(true);
            H2.setBackground(Color.white);
            this.add(H2);
            H2.setBounds(5, 105, 60, 25);
            JLabel R = new JLabel(n.getRecorrido());
            R.setForeground(Color.black);
            R.setOpaque(true);
            R.setBackground(Color.white);
            this.add(R);
            R.setBounds(5, 135, 40, 25);
        }
        else if (n.getModelo() == Modelos.HALCÓN_MILENARIO.getmodelo()) {
            this.setPreferredSize(new Dimension(512,384));
            this.X = new JButton(Modelos.HALCÓN_MILENARIO.getmodelo());
            this.add(X);
            X.setBounds(10, 10, 150, 20);
            JLabel H = new JLabel(n.getHorario());
            H.setForeground(Color.black);
            H.setOpaque(true);
            H.setBackground(Color.white);
            this.add(H);
            H.setBounds(10, 35, 60, 25);
            JLabel H1 = new JLabel(n.getHorario1());
            H1.setForeground(Color.black);
            H1.setOpaque(true);
            H1.setBackground(Color.white);
            this.add(H1);
            H1.setBounds(10, 65, 60, 25);
            JLabel H2 = new JLabel(n.getHorario2());
            H2.setForeground(Color.black);
            H2.setOpaque(true);
            H2.setBackground(Color.white);
            this.add(H2);
            H2.setBounds(10, 95, 60, 25);
            JLabel R = new JLabel(n.getRecorrido());
            R.setForeground(Color.black);
            R.setOpaque(true);
            R.setBackground(Color.white);
            this.add(R);
            R.setBounds(10, 125, 50, 25);
        }
        else if (n.getModelo() == Modelos.MORNING_STAR.getmodelo()) {
            this.setPreferredSize(new Dimension(422,240));
            this.X = new JButton(Modelos.MORNING_STAR.getmodelo());
            this.add(X);
            X.setBounds(10, 10, 150, 20);
            JLabel H = new JLabel(n.getHorario());
            H.setForeground(Color.black);
            H.setOpaque(true);
            H.setBackground(Color.white);
            this.add(H);
            H.setBounds(10, 35, 60, 25);
            JLabel H1 = new JLabel(n.getHorario1());
            H1.setForeground(Color.black);
            H1.setOpaque(true);
            H1.setBackground(Color.white);
            this.add(H1);
            H1.setBounds(10, 65, 60, 25);
            JLabel H2 = new JLabel(n.getHorario2());
            H2.setForeground(Color.black);
            H2.setOpaque(true);
            H2.setBackground(Color.white);
            this.add(H2);
            H2.setBounds(10, 95, 60, 25);
            JLabel R = new JLabel(n.getRecorrido());
            R.setForeground(Color.black);
            R.setOpaque(true);
            R.setBackground(Color.white);
            this.add(R);
            R.setBounds(10, 125, 40, 25);
        }
        else if (n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            this.setPreferredSize(new Dimension(150,733));
            this.X = new JButton(Modelos.UES_CONTACT_LIGHT.getmodelo());
            this.add(X);
            X.setBounds(0, 250, 150, 20);
            JLabel H = new JLabel(n.getHorario());
            H.setForeground(Color.black);
            H.setOpaque(true);
            H.setBackground(Color.white);
            this.add(H);
            H.setBounds(10, 275, 60, 25);
            JLabel H1 = new JLabel(n.getHorario1());
            H1.setForeground(Color.black);
            H1.setOpaque(true);
            H1.setBackground(Color.white);
            this.add(H1);
            H1.setBounds(10, 305, 60, 25);
            JLabel H2 = new JLabel(n.getHorario2());
            H2.setForeground(Color.black);
            H2.setOpaque(true);
            H2.setBackground(Color.white);
            this.add(H2);
            H2.setBounds(10, 335, 60, 25);
            JLabel R = new JLabel(n.getRecorrido());
            R.setForeground(Color.black);
            R.setOpaque(true);
            R.setBackground(Color.white);
            this.add(R);
            R.setBounds(10, 365, 70, 25);
        }
        X.addActionListener(this);
        this.Interior = new VentanaInterior(n);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(N.getModelo() == Modelos.APOLO_11.getmodelo()) {
            ImageIcon APOLO_11Icon = new ImageIcon(getClass().getClassLoader().getResource("Apolo_11.png"));
            g.drawImage(APOLO_11Icon.getImage(), 0, 0, null);
        }
        else if (N.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
            ImageIcon ARCA_DEL_VACÍOIcon = new ImageIcon(getClass().getClassLoader().getResource("Arca_del_Vacío.png"));
            g.drawImage(ARCA_DEL_VACÍOIcon.getImage(), 0, 0, null);
        }
        else if (N.getModelo() == Modelos.HALCÓN_MILENARIO.getmodelo()) {
            ImageIcon HALCÓN_MILENARIOIcon = new ImageIcon(getClass().getClassLoader().getResource("Halcón_Milenario.png"));
            g.drawImage(HALCÓN_MILENARIOIcon.getImage(), 0, 0, null);
        }
        else if (N.getModelo() == Modelos.MORNING_STAR.getmodelo()) {
            ImageIcon MORNING_STARIcon = new ImageIcon(getClass().getClassLoader().getResource("Morning_Star.png"));
            g.drawImage(MORNING_STARIcon.getImage(), 0, 0, null);
        }
        else if (N.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            ImageIcon UES_CONTACT_LIGHTIcon = new ImageIcon(getClass().getClassLoader().getResource("UES_Contact_Light.png"));
            g.drawImage(UES_CONTACT_LIGHTIcon.getImage(), 0, 0, null);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == X) {
            this.Interior.setVisible(true);
        }
    }
}