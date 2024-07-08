package parte_gráfica;
import parte_lógica.*;
/**Factory para PanelNaveEspacial del UESContactLight
 * @author Gustavo González
 * @version 1, 07 de julio de 2024*/
public class PanelUESContactLightFactory implements PanelNaveEspacialFactory {
    /**Constructor de PanelUESContactLightFactory*/
    public PanelUESContactLightFactory() {
    }
    @Override
    public PanelNaveEspacial crearPanelNaveEspacial(String H, String H1, String H2, String R) {
        return new PanelNaveEspacial(new UESContactLight(H, H1, H2, R));
    }
}