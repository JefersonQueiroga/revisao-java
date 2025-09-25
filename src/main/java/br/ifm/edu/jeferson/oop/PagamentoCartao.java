package br.ifm.edu.jeferson.oop;

/**
 * Classe concreta - implementação COMPLETA
 */
public class PagamentoCartao extends Pagamento {

    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);  // chama construtor da classe pai
        this.parcelas = parcelas;
    }

    @Override
    public String getTipo() {
        return "CARTAO";
    }

    @Override
    public boolean processar() {
        if (parcelas < 1 || parcelas > 12) {
            status = "ERRO";
            return false;
        }
        status = "PROCESSADO";
        return true;
    }

    @Override
    public double calcularTaxa() {
        if (parcelas == 1) {
            return valor * 0.03;  // 3%
        } else {
            return valor * 0.05;  // 5%
        }
    }
}