package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/**Panel que representa el interior de las naves espaciales
 * @author Gustavo González
 * @version versión 2, 01 de julio 2024*/
public class PanelInterior extends JPanel {
    /**Instancia lógica de la nave espacial*/
    private NaveEspacial n;
    /**Paneles de los asientos de la nave espacial*/
    private ArrayList<PanelAsiento> PanelesAsientos = new ArrayList<>();
    /**Constructor de PanelInterior*/
    public PanelInterior(NaveEspacial n) {
        this.n = n;
        this.setLayout(null);
        if(n.getModelo() == Modelos.APOLO_11.getmodelo()) {
            this.setPreferredSize(new Dimension(760, 570));
        }
        else if (n.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
            this.setPreferredSize(new Dimension(750, 594));
        }
        else if (n.getModelo() == Modelos.HALCÓN_MILENARIO.getmodelo()) {
            this.setPreferredSize(new Dimension(750, 500));
        }
        else if (n.getModelo() == Modelos.MORNING_STAR.getmodelo()) {
            this.setPreferredSize(new Dimension(750, 481));
        }
        else if (n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            this.setPreferredSize(new Dimension(499, 261));
            for (int i = 0; i < 100; i = i + 1) {
                this.PanelesAsientos.add(new PanelAsiento(n.getAsiento(i)));
            }
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(n.getModelo() == Modelos.APOLO_11.getmodelo()) {
            ImageIcon APOLO_11_InteriorIcon = new ImageIcon(getClass().getClassLoader().getResource("Apolo_11_Interior.png"));
            g.drawImage(APOLO_11_InteriorIcon.getImage(), 0, 0, null);
        }
        else if (n.getModelo() == Modelos.ARCA_DEL_VACÍO.getmodelo()) {
            ImageIcon ARCA_DEL_VACÍO_InteriorIcon = new ImageIcon(getClass().getClassLoader().getResource("BACS.png"));
            g.drawImage(ARCA_DEL_VACÍO_InteriorIcon.getImage(), 0, 0, null);
        }
        else if (n.getModelo() == Modelos.HALCÓN_MILENARIO.getmodelo()) {
            ImageIcon HALCÓN_MILENARIO_InteriorIcon = new ImageIcon(getClass().getClassLoader().getResource("Halcón_Milenario_Interior.png"));
            g.drawImage(HALCÓN_MILENARIO_InteriorIcon.getImage(), 0, 0, null);
        }
        else if (n.getModelo() == Modelos.MORNING_STAR.getmodelo()) {
            ImageIcon MORNING_STAR_InteriorIcon = new ImageIcon(getClass().getClassLoader().getResource("Morning_Star_Interior.png"));
            g.drawImage(MORNING_STAR_InteriorIcon.getImage(), 0, 0, null);
        }
        else if (n.getModelo() == Modelos.UES_CONTACT_LIGHT.getmodelo()) {
            ImageIcon UES_CONTACT_LIGHT_InteriorIcon = new ImageIcon(getClass().getClassLoader().getResource("UES_Contact_Light_Interior.png"));
            g.drawImage(UES_CONTACT_LIGHT_InteriorIcon.getImage(), 0, 0, null);
        }
    }
}