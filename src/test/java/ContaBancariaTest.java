import br.unipar.ContaCorrente;
import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testDepositoContaCorrente(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);

        assertEquals(conta.obterSaldo(), 3000);

    }

    @Test
    public void testSaqueContaCorrente(){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(1500,conta.obterSaldo());
    }

    @Test
    public void testSaqueMaiorSaldoContaCorrente(){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(4500d);

        assertFalse(validacao);
        assertEquals(3000,conta.obterSaldo());
    }

    @Test
    public void testSaqueMaiorSaldoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(3000d);

        assertFalse(validacao);
        assertEquals(3000, conta.obterSaldo());
    }

    @Test
    public void testDepositoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);

        assertEquals(conta.obterSaldo(),3000);

    }

    @Test
    public void testSaqueSucessoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(4000d);
        boolean validacao = conta.saque(3000d);

        assertTrue(validacao);
        assertEquals(995,conta.obterSaldo());

    }

   @Test
    public void testSaqueInvalidoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(3000d);

        assertFalse(validacao);
        assertEquals(3000,conta.obterSaldo());

   }

}
