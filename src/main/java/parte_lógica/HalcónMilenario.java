package parte_lógica;
/**Clase HalcónMilenario
 * @author Gustavo González
 * @version versión 1, 19 de junio 2024*/
public class HalcónMilenario extends NaveEspacial {
    /**Constructor de HalcónMilenario
     * @param horario String
     * @param recorrido String*/
    public HalcónMilenario(String horario, String recorrido) {
        super(horario, recorrido, Modelos.HALCÓN_MILENARIO);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}