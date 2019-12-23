package com.creditcard.creditcards.repository;

import com.creditcard.creditcards.entity.CreditCard;
import com.creditcard.creditcards.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
