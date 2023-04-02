package com.example.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailingApplication {
private final EmailSenderService senderService;

    public MailingApplication(EmailSenderService senderService) {
        this.senderService = senderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MailingApplication.class, args);
    }
@EventListener(ApplicationReadyEvent.class)
    public void SendMail(){
        senderService.sendEmail("alibouzid232@gmail.com","SQL Manager\n" +
                "for PostgreSQL","Design, explore and maintain databases, build compound SQL query statements, manage database user rights, and manipulate data fast and conveniently.\n" +
                "\n" +
                "\n  ");
}
}
