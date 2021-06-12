package com.example.sample.controller.twilio;

import com.example.sample.config.TwilioConfiguration;
import com.example.sample.model.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TwilioSmsSender implements SmsSender {

    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequest smsRequest) {

        PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
        PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrial_number());
        String message = smsRequest.getMessage();
        
        if(isPhoneNumberValid(to)) {
            MessageCreator messageCreator = Message.creator(to, from, message);
            messageCreator.create();
            log.info("Send SMS: {} ",smsRequest);
        } else {
            throw new IllegalArgumentException("phone number " + to + "is not a valid number");
        }
    }

    private boolean isPhoneNumberValid(PhoneNumber to) {
        //TODO: implement googles library to validate
        return true;
    }
}
