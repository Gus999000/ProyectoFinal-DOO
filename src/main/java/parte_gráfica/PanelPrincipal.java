package parte_gráfica;
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 4, 07 de julio de 2024*/
public class PanelPrincipal extends JPanel {
    /**Constructor del panel principal*/
    public PanelPrincipal() {
        super();
        this.setLayout(new FlowLayout());
        PanelApolo11Factory PApolo11F = new PanelApolo11Factory();
        this.add(PApolo11F.crearPanelNaveEspacial("13:32 P.M", "18:07 P.M", "21:22 P.M", "Luna"));
        PanelArcaDelVacíoFactory PArcaDelVacíoF = new PanelArcaDelVacíoFactory();
        this.add(PArcaDelVacíoF.crearPanelNaveEspacial("07:21 A.M", "14:15 P.M", "20:07 P.M", "Marte"));
        PanelHalcónMilenarioFactory PHalcónMilenarioF = new PanelHalcónMilenarioFactory();
        this.add(PHalcónMilenarioF.crearPanelNaveEspacial("07:06 A.M", "17:07 P.M", "19:07 P.M", "Corellia"));
        PanelMorningStarFactory PMorningStarF = new PanelMorningStarFactory();
        this.add(PMorningStarF.crearPanelNaveEspacial("07:21 A.M", "11:00 A.M", "20:07 P.M", "Tierra"));
        PanelUESContactLightFactory PUESContactLightF = new PanelUESContactLightFactory();
        this.add(PUESContactLightF.crearPanelNaveEspacial("06:21 A.M", "11:22 A.M", "18:22 P.M", "Petrichor V"));
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon DRGIcon = new ImageIcon(getClass().getClassLoader().getResource("DRG.png"));
        g.drawImage(DRGIcon.getImage(), 0, 0, null);
    }
}