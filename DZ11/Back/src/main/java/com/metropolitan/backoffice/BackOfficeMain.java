package com.metropolitan.backoffice;

import com.metropolitan.backoffice.config.BackOfficeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BackOfficeMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BackOfficeConfiguration.class);

        BackOffice backOffice = context.getBean(BackOffice.class);
        Mail mail = backOffice.receiveMail();
        System.out.println ("JMS poruka je primljena!!!");
        System.out.println("ID pošiljke :" + mail.getMailId());
        System.out.println("Država u koju se šalje :" + mail.getCountry());
        System.out.println("Masa pošiljke :" + mail.getWeight() );
    }
}