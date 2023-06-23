package com.metropolitan.frontdesk;

import org.springframework.jms.core.support.JmsGatewaySupport;

public class FrontDeskImpl extends JmsGatewaySupport implements FrontDesk {

    @Override
    public void sendMail(final Mail mail) {
        getJmsTemplate().convertAndSend(mail);
    }
}



