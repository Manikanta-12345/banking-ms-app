package com.techapps.tellicaller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {


    private int id;

    private String accountType;

    private double balance;

    private String accountHolderName;

    private String customerId;
}
