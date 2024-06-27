package parte_lógica;
/**Clase Apolo11
 * @author Gustavo González
 * @version versión 2, 26 de junio 2024*/
public class Apolo11 extends NaveEspacial {
    /**Constructor de Apolo11
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public Apolo11(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.APOLO_11);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}