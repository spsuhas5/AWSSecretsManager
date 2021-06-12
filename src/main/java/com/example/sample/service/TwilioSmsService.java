package com.example.sample.service;

import com.example.sample.controller.twilio.TwilioSmsSender;
import com.example.sample.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsService {

    private final TwilioSmsSender twilioSmsSender;

    @Autowired
    public TwilioSmsService(TwilioSmsSender twilioSmsSender) {
        this.twilioSmsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        twilioSmsSender.sendSms(smsRequest);
    }
}
