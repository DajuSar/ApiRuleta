package com.masiv.ruletaAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masiv.ruletaAPI.interfaceServices.IbetService;
import com.masiv.ruletaAPI.model.Bet;

@RestController
@RequestMapping
public class APIController {

	@Autowired
	private IbetService betService;

	@GetMapping("/betsList")
	public List<Bet> toList() {
		List<Bet> bets = betService.toList();
		return bets;
	}

	@PostMapping("/saveBet/{idRoulette}/")
	public Bet save(@RequestBody Bet bet, @RequestHeader("id-user") int idUser, @PathVariable int idRoulette) {

		return betService.save(bet, idUser, idRoulette);
	}
}
