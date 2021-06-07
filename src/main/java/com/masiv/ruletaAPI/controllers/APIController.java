package com.masiv.ruletaAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masiv.ruletaAPI.interfaceServices.IbetService;
import com.masiv.ruletaAPI.interfaceServices.IrouletteService;
import com.masiv.ruletaAPI.model.Bet;
import com.masiv.ruletaAPI.model.Roulette;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class APIController {
	
	@Autowired
	private IbetService betService;
	@GetMapping("/betsList")
	public String  toList(Model model) {
		List<Bet> bets = betService.toList();
		model.addAttribute("bets", bets);
		
		return "index";
	}

	
}
