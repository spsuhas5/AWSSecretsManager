package com.example.sample.controller.twilio;

import com.example.sample.model.SmsRequest;
import com.example.sample.service.TwilioSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {

    private final TwilioSmsService twilioSmsService;

    @Autowired
    public TwilioController(TwilioSmsService twilioSmsService) {
        this.twilioSmsService = twilioSmsService;
    }

    @PostMapping("send")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        twilioSmsService.sendSms(smsRequest);
    }
}
