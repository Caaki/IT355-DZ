package com.metropolitan.backoffice;

import org.springframework.jms.core.support.JmsGatewaySupport;

public class BackOfficeImpl extends JmsGatewaySupport implements BackOffice {

    @Override
    public Mail receiveMail() {
	return (Mail) getJmsTemplate().receiveAndConvert();
    }
}


