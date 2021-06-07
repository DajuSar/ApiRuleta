package com.masiv.ruletaAPI.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masiv.ruletaAPI.model.Roulette;

@Repository
public interface IRoulette extends CrudRepository<Roulette, Integer>{}
