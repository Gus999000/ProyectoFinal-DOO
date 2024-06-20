package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 2, 20 de junio de 2024*/
public class PanelPrincipal extends JPanel {
    /**Constructor del panel principal*/
    public PanelPrincipal () {
        super();
        this.setLayout(new FlowLayout());
        this.add(new PanelNaveEspacial(new Apolo11("13:32 P.M", "Luna")));
        this.add(new PanelNaveEspacial(new ArcaDelVacío("07:21 A.M", "Marte")));
        this.add(new PanelNaveEspacial(new HalcónMilenario("17:07 P.M", "Corellia")));
        this.add(new PanelNaveEspacial(new MorningStar("20:07 P.M", "Tierra")));
        this.add(new PanelNaveEspacial(new UESContactLight("06:21 A.M", "Petrichor V")));
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon DRGIcon = new ImageIcon(getClass().getClassLoader().getResource("DRG.png"));
        g.drawImage(DRGIcon.getImage(), 0, 0, null);
    }
}