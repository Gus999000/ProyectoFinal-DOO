package parte_gráfica;
/**Interface Factory para PanelNaveEspacial
 * @author Gustavo González
 * @version 1, 07 de julio de 2024*/
public interface PanelNaveEspacialFactory {
    /**Método que crea paneles de naves espaciales
     * @param H String
     * @param H1 String
     * @param H2 String
     * @param R String*/
    PanelNaveEspacial crearPanelNaveEspacial(String H, String H1, String H2, String R);
}