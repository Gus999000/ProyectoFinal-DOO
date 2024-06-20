package parte_lógica;
/**Clase MorningStar
 * @author Gustavo González
 * @version versión 1, 19 de junio 2024*/
public class MorningStar extends NaveEspacial {
    /**Constructor de MorningStar
     * @param horario String
     * @param recorrido String*/
    public MorningStar(String horario, String recorrido) {
        super(horario, recorrido, Modelos.MORNING_STAR);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}