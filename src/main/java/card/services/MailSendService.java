package card.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSendService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String message){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("tomekjusko@gmail.com");
        mailMessage.setSubject("wiadomosc z twojego serwisu");
        mailMessage.setText(message);

        mailSender.send(mailMessage);
    }
}
