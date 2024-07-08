package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la inicialización de los asientos en ArcaDelVacío
 * @author Gustavo Benitez
 * @version 1, 08 de julio de 2024*/
class ArcaDelVacíoTest {

    @Test
    void deberíaInicializarConElNúmeroCorrectoDeAsientos() {
        String horario = "07:00";
        String horario1 = "13:00";
        String horario2 = "19:00";
        String recorrido = "Órbita de Marte";

        ArcaDelVacío arcaDelVacío = new ArcaDelVacío(horario, horario1, horario2, recorrido);

        assertThat(arcaDelVacío.getAsiento(0)).isInstanceOf(AsientoNormal.class);
        assertThat(arcaDelVacío.getAsiento(29)).isInstanceOf(AsientoNormal.class);
        assertThat(arcaDelVacío.getAsiento(30)).isInstanceOf(AsientoSemiCama.class);
        assertThat(arcaDelVacío.getAsiento(34)).isInstanceOf(AsientoSemiCama.class);
        assertThat(arcaDelVacío.getAsiento(35)).isInstanceOf(AsientoSalónCama.class);
        assertThat(arcaDelVacío.getAsiento(39)).isInstanceOf(AsientoSalónCama.class);
    }
}
