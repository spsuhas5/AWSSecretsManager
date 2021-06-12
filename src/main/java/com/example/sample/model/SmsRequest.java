package com.example.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsRequest {

    @NotBlank
    @JsonProperty("phoneNum")
    private String phoneNumber;

    @NotBlank
    @JsonProperty("message")
    private String message;

}
