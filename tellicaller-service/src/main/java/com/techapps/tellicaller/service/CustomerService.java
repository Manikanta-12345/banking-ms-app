package com.techapps.tellicaller.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techapps.tellicaller.dto.Accounts;
import com.techapps.tellicaller.dto.Cards;
import com.techapps.tellicaller.dto.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CustomerService {

    @Value("${accounts.url}")
    private String accountsURL;

    @Value("${cards.url}")
    private String cardsURL;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RestTemplate restTemplate;

    public CustomerDto getCustomerDetails(String customerId) {

        //accounts ms call
        ResponseEntity<Accounts> accountsResponse  = restTemplate.getForEntity(accountsURL+"/v1/accounts/accountByCustomerId/"+customerId,Accounts.class);
        Accounts accounts = accountsResponse.getBody();

        //cards ms call
        ResponseEntity<Cards> cardsResponse  = restTemplate.getForEntity(cardsURL+"/v1/cards/cardsByCustomerId/"+customerId,Cards.class);
        Cards cards = cardsResponse.getBody();
        return CustomerDto.builder().accounts(accounts).cards(cards).build();
    }
}
