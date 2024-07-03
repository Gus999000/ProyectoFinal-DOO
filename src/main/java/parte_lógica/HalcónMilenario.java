package parte_lógica;
/**Clase HalcónMilenario
 * @author Gustavo González
 * @version versión 3, 02 de julio 2024*/
public class HalcónMilenario extends NaveEspacial {
    /**Constructor de HalcónMilenario
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public HalcónMilenario(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.HALCÓN_MILENARIO);
        for (int i = 0; i < 20; i = i + 1) {
            this.addAsiento(new AsientoNormal(i + 1));
        }
        for (int i = 0; i < 10; i = i + 1) {
            this.addAsiento(new AsientoSemiCama(i + 21));
        }
    }
}