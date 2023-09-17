package com.techapps.tellicaller.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cards {

    private int id;

    private String cardType;

    private double balance;

    private String customerId;
}
