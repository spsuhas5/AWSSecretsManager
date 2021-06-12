package com.example.sample.config;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class TwilioInitializer {


    private final TwilioConfiguration twilioConfiguration;

    public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;

        Twilio.init(twilioConfiguration.getAccount_sid(), twilioConfiguration.getAuth_token());

        log.info("Twiliio initialized..with account sid {} ", twilioConfiguration.getAccount_sid());
    }
}
