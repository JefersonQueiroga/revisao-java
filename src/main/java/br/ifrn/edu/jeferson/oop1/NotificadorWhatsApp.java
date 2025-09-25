package br.ifrn.edu.jeferson.oop1;

class NotificadorWhatsApp implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[WHATSAPP] Enviando: " + mensagem);
    }

    @Override
    public String getTipo() {
        return "WhatsApp";
    }
}