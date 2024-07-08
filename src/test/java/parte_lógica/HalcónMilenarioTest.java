package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la inicialización de los asientos en HalcónMilenario
 * @author Gustavo Benitez
 * @version 1, 07 de julio de 2024*/
class HalcónMilenarioTest {

    @Test
    void deberíaInicializarConElNúmeroCorrectoDeAsientos() {
        String horario = "05:00";
        String horario1 = "13:30";
        String horario2 = "20:00";
        String recorrido = "Órbita de Júpiter";

        HalcónMilenario halcónMilenario = new HalcónMilenario(horario, horario1, horario2, recorrido);

        assertThat(halcónMilenario.getAsiento(0)).isInstanceOf(AsientoNormal.class);
        assertThat(halcónMilenario.getAsiento(17)).isInstanceOf(AsientoNormal.class);
        assertThat(halcónMilenario.getAsiento(20)).isInstanceOf(AsientoSemiCama.class);
        assertThat(halcónMilenario.getAsiento(24)).isInstanceOf(AsientoSemiCama.class);
    }
}
