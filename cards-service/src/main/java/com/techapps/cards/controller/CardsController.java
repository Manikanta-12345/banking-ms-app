package com.techapps.cards.controller;

import com.techapps.cards.entity.Cards;
import com.techapps.cards.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/cards/")
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @PostMapping(value = "/create-cards")
    public ResponseEntity<Cards> createCards(@RequestBody Cards cards) {

        return new ResponseEntity<Cards>(cardsService.createCards(cards), HttpStatus.OK);
    }


    @GetMapping(value = "/cardsByCustomerId/{customerId}")
    public ResponseEntity<Cards> cardsByCustomerId(@PathVariable String customerId) {

        return new ResponseEntity<Cards>(cardsService.getCards(customerId), HttpStatus.OK);
    }
}
