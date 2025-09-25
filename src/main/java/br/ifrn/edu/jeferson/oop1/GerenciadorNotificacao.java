package br.ifrn.edu.jeferson.oop1;

import java.util.ArrayList;
import java.util.List;

class GerenciadorNotificacao {
    private ArrayList<Notificador> notificadores = new ArrayList<>();

    // Método recebe INTERFACE - aceita qualquer implementação
    public void adicionarNotificador(Notificador notificador) {
        notificadores.add(notificador);
        System.out.println("Adicionado: " + notificador.getTipo());
    }

    // Envia por TODOS os notificadores
    public void notificarTodos(String mensagem) {
        System.out.println("\nNotificando todos os canais:");
        for (Notificador n : notificadores) {
            n.enviar(mensagem);
        }
    }

    // Envia por UM notificador específico
    public void notificar(Notificador canal, String mensagem) {
        System.out.println("\nNotificação única:");
        canal.enviar(mensagem);
    }
}