package br.ifrn.edu.jeferson.oop1;

class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Enviando: " + mensagem);
    }

    @Override
    public String getTipo() {
        return "SMS";
    }
}