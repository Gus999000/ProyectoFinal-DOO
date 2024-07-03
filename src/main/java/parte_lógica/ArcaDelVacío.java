package parte_lógica;
/**Clase ArcaDelVacío
 * @author Gustavo González
 * @version versión 3, 02 de julio 2024*/
public class ArcaDelVacío extends NaveEspacial {
    /**Constructor de ArcaDelVacío
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public ArcaDelVacío(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.ARCA_DEL_VACÍO);
        for (int i = 0; i < 30; i = i + 1) {
            this.addAsiento(new AsientoNormal(i + 1));
        }
        for (int i = 0; i < 5; i = i + 1) {
            this.addAsiento(new AsientoSemiCama(i + 31));
        }
        for (int i = 0; i < 5; i = i + 1) {
            this.addAsiento(new AsientoSalónCama(i + 36));
        }
    }
}