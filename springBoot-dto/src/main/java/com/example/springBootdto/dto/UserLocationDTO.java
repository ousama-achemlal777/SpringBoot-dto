package com.example.springBootdto.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private String userId;
    private String email;
    private String palce;

    private double longitude;
    private double latitude;

}
