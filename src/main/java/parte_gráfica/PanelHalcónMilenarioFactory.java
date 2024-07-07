package parte_gráfica;
import parte_lógica.*;
/**Factory para PanelNaveEspacial del HalcónMilenario
 * @author Gustavo González
 * @version 1, 07 de julio de 2024*/
public class PanelHalcónMilenarioFactory implements PanelNaveEspacialFactory {
    /**Constructor de PanelHalcónMilenarioFactory*/
    public PanelHalcónMilenarioFactory() {
    }
    @Override
    public PanelNaveEspacial crearPanelNaveEspacial(String H, String H1, String H2, String R) {
        return new PanelNaveEspacial(new HalcónMilenario(H, H1, H2, R));
    }
}