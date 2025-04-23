import main.java.br.ucb.entidade.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setup() {
        
        cliente = new Cliente("Carlos Eduardo", false);
    }

    @Test
    public void testGetNome() {
        assertEquals("Carlos Eduardo", cliente.getNome(), "Nome do cliente não é o esperado");
    }

    @Test
    public void testIsInadimplente() {
        assertFalse(cliente.isInadimplente(), "O cliente não deveria ser inadimplente");
    }

    @Test
    public void testSetInadimplente() {
        cliente.setInadimplente(true);
        assertTrue(cliente.isInadimplente(), "O cliente deveria ser inadimplente após a alteração");
    }
}
