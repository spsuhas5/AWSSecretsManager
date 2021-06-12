package com.example.sample.controller.twilio;

import com.example.sample.model.SmsRequest;

public interface SmsSender {

    void sendSms(SmsRequest smsRequest);
}
