package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria {
    @Override
    public boolean saque(Double valor) {
        if ((saldo - valor - 5) >= 0) {
            saldo -= 5;
            saldo -= valor;
            return true;
        }
        return false;
    }
}