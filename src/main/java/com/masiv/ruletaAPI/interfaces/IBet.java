package com.masiv.ruletaAPI.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masiv.ruletaAPI.model.Bet;

@Repository
public interface IBet extends CrudRepository<Bet, Integer> {
}
