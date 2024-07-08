package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la creación del Asiento Salón Cama
 * @author Gustavo Benitez
 * @version 1, 08 de julio de 2024*/
class AsientoSalónCamaTest {

    @Test
    void deberíaCrearAsientoSalónCamaConLasPropiedadesCorrectas() {
        int numero = 33;

        AsientoSalónCama asientoSalónCama = new AsientoSalónCama(numero);

        assertThat(asientoSalónCama.getNúmero()).isEqualTo(numero);
        assertThat(asientoSalónCama.getCategoría()).isEqualTo("Salón cama");
        assertThat(asientoSalónCama.getPrecio()).isEqualTo(10000);
    }
}
