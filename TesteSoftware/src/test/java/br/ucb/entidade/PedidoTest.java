import main.java.br.ucb.entidade.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    private Pedido pedido;
    private Cliente cliente;

    @BeforeEach
    public void setup() {
        cliente = new Cliente("Carlos Eduardo", false);
        pedido = new Pedido(1, cliente);
    }

    @Test
    public void testPedidoNaoFinalizadoAoCriar() {
        assertFalse(pedido.isFinalizado(), "O pedido não deveria estar finalizado ao ser criado");
    }

    @Test
    public void testFinalizarPedido() {
        pedido.setFinalizado(true);
        assertTrue(pedido.isFinalizado(), "O pedido deveria estar finalizado após a mudança de estado");
    }

    @Test
    public void testCancelarPedido() {
        pedido.setCancelado(true);
        assertTrue(pedido.isCancelado(), "O pedido deveria estar cancelado após a mudança de estado");
    }
}
