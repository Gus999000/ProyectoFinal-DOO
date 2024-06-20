package parte_lógica;
/**Clase Apolo11
 * @author Gustavo González
 * @version versión 1, 19 de junio 2024*/
public class Apolo11 extends NaveEspacial {
    /**Constructor de Apolo11
     * @param horario String
     * @param recorrido String*/
    public Apolo11(String horario, String recorrido) {
        super(horario, recorrido, Modelos.APOLO_11);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}