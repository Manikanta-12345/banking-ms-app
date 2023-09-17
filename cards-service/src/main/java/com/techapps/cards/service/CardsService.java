package com.techapps.cards.service;

import com.techapps.cards.entity.Cards;
import com.techapps.cards.repository.CardsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CardsService {

    @Autowired
    private CardsRepository cardsRepository;

    public Cards createCards(Cards cards) {
        log.info("cards creation started");
        return cardsRepository.save(cards);
    }

    public Cards getCards(String customerId) {
        log.info("get cards by customerId started");
        return cardsRepository.findByCustomerId(customerId);
    }
}
