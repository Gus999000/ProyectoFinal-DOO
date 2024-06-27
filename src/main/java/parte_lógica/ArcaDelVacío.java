package parte_lógica;
/**Clase ArcaDelVacío
 * @author Gustavo González
 * @version versión 2, 26 de junio 2024*/
public class ArcaDelVacío extends NaveEspacial {
    /**Constructor de ArcaDelVacío
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String*/
    public ArcaDelVacío(String horario, String horario1, String horario2, String recorrido) {
        super(horario, horario1, horario2, recorrido, Modelos.ARCA_DEL_VACÍO);
        //for (int i = 0; i < 20; i = i + 1) {NaveEspacial.add(new Asiento(i));}
    }
}