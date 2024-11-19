package com.example.Model;

import lombok.Data;

@Data
public class RequestDTO {

    private String rqUID;
    private String clientId;
    private String account;
    private String openDate;
    private String closeDate;
}
