package parte_lógica;
/**Clase UESContactLight
 * @author Gustavo González
 * @version versión 1, 19 de junio 2024*/
public class UESContactLight extends NaveEspacial {
    /**Constructor de UESContactLight
     * @param horario String
     * @param recorrido String*/
    public UESContactLight(String horario, String recorrido) {
        super(horario, recorrido, Modelos.UES_CONTACT_LIGHT);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}