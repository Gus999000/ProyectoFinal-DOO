package parte_gráfica;
import parte_lógica.*;
/**Factory para PanelNaveEspacial del Apolo11
 * @author Gustavo González
 * @version 1, 07 de julio de 2024*/
public class PanelApolo11Factory implements PanelNaveEspacialFactory {
    /**Constructor de PanelApolo11Factory*/
    public PanelApolo11Factory() {
    }
    @Override
    public PanelNaveEspacial crearPanelNaveEspacial(String H, String H1, String H2, String R) {
        return new PanelNaveEspacial(new Apolo11(H, H1, H2, R));
    }
}