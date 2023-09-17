package com.techapps.cards.repository;

import com.techapps.cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository  extends JpaRepository<Cards,Integer> {

    Cards findByCustomerId(String customerId);
}
