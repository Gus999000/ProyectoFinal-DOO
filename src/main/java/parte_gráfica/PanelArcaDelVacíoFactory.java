package parte_gráfica;
import parte_lógica.*;
/**Factory para PanelNaveEspacial del ArcaDelVacío
 * @author Gustavo González
 * @version 1, 07 de julio de 2024*/
public class PanelArcaDelVacíoFactory implements PanelNaveEspacialFactory {
    /**Constructor de PanelArcaDelVacíoFactory*/
    public PanelArcaDelVacíoFactory() {
    }
    @Override
    public PanelNaveEspacial crearPanelNaveEspacial(String H, String H1, String H2, String R) {
        return new PanelNaveEspacial(new ArcaDelVacío(H, H1, H2, R));
    }
}