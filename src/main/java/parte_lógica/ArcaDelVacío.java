package parte_lógica;
/**Clase ArcaDelVacío
 * @author Gustavo González
 * @version versión 1, 19 de junio 2024*/
public class ArcaDelVacío extends NaveEspacial {
    /**Constructor de ArcaDelVacío
     * @param horario String
     * @param recorrido String*/
    public ArcaDelVacío(String horario, String recorrido) {
        super(horario, recorrido, Modelos.ARCA_DEL_VACÍO);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}