package br.ifrn.edu.jeferson.oop1;

public class SistemaNotificacaoMain {
    // Método estático que recebe interface
    public static void testarNotificador(Notificador notificador) {
        System.out.println("\nTestando " + notificador.getTipo());
        notificador.enviar("Mensagem de teste");
    }

    public static void main(String[] args) {
        // Criar diferentes notificadores
        NotificadorEmail email = new NotificadorEmail();
        NotificadorSMS sms = new NotificadorSMS();
        NotificadorWhatsApp whats = new NotificadorWhatsApp();

        // 1. Método que aceita interface
        System.out.println("=== TESTE INDIVIDUAL ===");
        testarNotificador(email);
        testarNotificador(sms);
        testarNotificador(whats);

        // 2. Gerenciador usa interface
        System.out.println("\n=== GERENCIADOR ===");
        GerenciadorNotificacao gerenciador = new GerenciadorNotificacao();

        gerenciador.adicionarNotificador(email);
        gerenciador.adicionarNotificador(sms);
        gerenciador.adicionarNotificador(whats);

        gerenciador.notificarTodos("Sistema atualizado!");
    }
}
