import main.java.br.ucb.entidade.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    private Produto produto;

    @BeforeEach
    public void setup() {
       
        produto = new Produto(1, "Produto Teste", 100.0);
    }

    @Test
    public void testGetNome() {
        assertEquals("Produto Teste", produto.getNome(), "Nome do produto não é o esperado");
    }

    @Test
    public void testSetPrecoValido() {
        produto.setPreco(120.0);
        assertEquals(120.0, produto.getPreco(), "Preço do produto não foi atualizado corretamente");
    }

    @Test
    public void testSetPrecoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> produto.setPreco(-10.0), "Deveria lançar uma exceção para preço negativo");
    }

    @Test
    public void testAplicarDesconto() {
        produto.aplicarDesconto(10);  // Aplica 10% de desconto
        assertEquals(90.0, produto.getPreco(), "Preço após desconto não foi calculado corretamente");
    }

    @Test
    public void testAplicarDescontoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> produto.aplicarDesconto(110), "Deveria lançar uma exceção para desconto inválido");
    }

    @Test
    public void testToString() {
        String expectedString = "Produto{id=1, nome='Produto Teste', preco=100.0}";
        assertEquals(expectedString, produto.toString(), "A string representando o produto não está correta");
    }
}
