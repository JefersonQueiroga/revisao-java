package br.ifm.edu.jeferson.oop;

/**
 * Implementação PIX
 */
public class PagamentoPix extends Pagamento {

    private String chave;

    public PagamentoPix(double valor, String chave) {
        super(valor);
        this.chave = chave;
    }

    @Override
    public String getTipo() {
        return "PIX";
    }

    @Override
    public boolean processar() {
        if (chave == null || chave.isEmpty()) {
            status = "ERRO";
            return false;
        }
        status = "PROCESSADO";
        return true;
    }

    @Override
    public double calcularTaxa() {
        return 0;  // PIX não tem taxa
    }
}