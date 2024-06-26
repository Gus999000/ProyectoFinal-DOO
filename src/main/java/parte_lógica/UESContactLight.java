package parte_lógica;
/**Clase UESContactLight
 * @author Gustavo González
 * @version versión 3, 29 de junio 2024*/
public class UESContactLight extends NaveEspacial {
    /**Constructor de UESContactLight
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public UESContactLight(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.UES_CONTACT_LIGHT);
        for (int i = 0; i < 100; i = i + 1) {
            this.addAsiento(new AsientoNormal(i + 1));
        }
    }
}