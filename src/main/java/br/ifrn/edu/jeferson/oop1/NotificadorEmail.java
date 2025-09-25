package br.ifrn.edu.jeferson.oop1;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Enviando: " + mensagem);
    }

    @Override
    public String getTipo() {
        return "Email";
    }
}
