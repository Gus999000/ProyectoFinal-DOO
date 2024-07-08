package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la creación del Asiento Semi Cama
 * @author Gustavo Benitez
 * @version 1, 08 de julio de 2024*/
class AsientoSemiCamaTest {

    @Test
    void deberíaCrearAsientoSemiCamaConLasPropiedadesCorrectas() {
        int numero = 8;

        AsientoSemiCama asientoSemiCama = new AsientoSemiCama(numero);

        assertThat(asientoSemiCama.getNúmero()).isEqualTo(numero);
        assertThat(asientoSemiCama.getCategoría()).isEqualTo("Semi cama");
        assertThat(asientoSemiCama.getPrecio()).isEqualTo(5000);
    }
}
