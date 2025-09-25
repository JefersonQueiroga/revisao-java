package br.ifm.edu.jeferson.oop;

/**
 * Implementação Boleto
 */
public class PagamentoBoleto extends Pagamento {

    private int diasVencimento;

    public PagamentoBoleto(double valor, int diasVencimento) {
        super(valor);
        this.diasVencimento = diasVencimento;
    }

    @Override
    public String getTipo() {
        return "BOLETO";
    }

    @Override
    public boolean processar() {
        if (diasVencimento < 1 || diasVencimento > 30) {
            status = "ERRO";
            return false;
        }
        status = "AGUARDANDO";
        return true;
    }

    @Override
    public double calcularTaxa() {
        return 3.50;  // taxa fixa
    }
}