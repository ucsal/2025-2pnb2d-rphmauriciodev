package br.com.mariojp.solid.dip;

public class Noop implements MailSender{

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Email enviado para: " + to + " Assunto: " + subject + " Corpo: " + body);
    }
    
}
