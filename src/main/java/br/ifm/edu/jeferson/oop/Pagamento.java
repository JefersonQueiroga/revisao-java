package br.ifm.edu.jeferson.oop;

/**
 * Classe abstrata - implementação PARCIAL
 * Tem código + métodos abstratos
 */
public abstract class Pagamento implements Processavel, Taxavel {

    protected double valor;
    protected String status;

    // Construtor
    public Pagamento(double valor) {
        this.valor = valor;
        this.status = "PENDENTE";
    }

    // Método concreto (implementado)
    @Override
    public String getStatus() {
        return status;
    }

    // Método concreto
    @Override
    public void cancelar() {
        if (!status.equals("PROCESSADO")) {
            status = "CANCELADO";
        }
    }

    // Método abstrato - filhos devem implementar
    public abstract String getTipo();

    // Método concreto que usa o abstrato
    public void exibir() {
        System.out.println(getTipo() + " - R$ " + valor + " - " + status);
    }
}