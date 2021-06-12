package com.example.sample.controller.twilio;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioExample {

    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC01cf3bbfe7509b6f1e0db14de8052865"; //System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = "6b49a69287211138f4151854a45b2e96"; //System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+917204450680"),
                new com.twilio.type.PhoneNumber("+917204450680"),
                "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }

}
