package parte_lógica;
/**Clase MorningStar
 * @author Gustavo González
 * @version versión 2, 26 de junio 2024*/
public class MorningStar extends NaveEspacial {
    /**Constructor de MorningStar
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public MorningStar(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.MORNING_STAR);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}