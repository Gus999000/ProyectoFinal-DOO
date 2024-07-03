package parte_lógica;
/**Clase MorningStar
 * @author Gustavo González
 * @version versión 3, 02 de julio 2024*/
public class MorningStar extends NaveEspacial {
    /**Constructor de MorningStar
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public MorningStar(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.MORNING_STAR);
        for (int i = 0; i < 30; i = i + 1) {
            this.addAsiento(new AsientoNormal(i + 1));
        }
        for (int i = 0; i < 10; i = i + 1) {
            this.addAsiento(new AsientoSalónCama(i + 31));
        }
        for (int i = 0; i < 10; i = i + 1) {
            this.addAsiento(new AsientoMasajeador(i + 41));
        }
    }
}