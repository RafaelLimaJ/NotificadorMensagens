package com.sistemanotificaçao.entitys;

public class SmsNotificador implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}