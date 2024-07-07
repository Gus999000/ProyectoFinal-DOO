package parte_gráfica;
import parte_lógica.*;
/**Factory para PanelNaveEspacial del MorningStar
 * @author Gustavo González
 * @version 1, 07 de julio de 2024*/
public class PanelMorningStarFactory implements PanelNaveEspacialFactory {
    /**Constructor de PanelMorningStarFactory*/
    public PanelMorningStarFactory() {
    }
    @Override
    public PanelNaveEspacial crearPanelNaveEspacial(String H, String H1, String H2, String R) {
        return new PanelNaveEspacial(new MorningStar(H, H1, H2, R));
    }
}