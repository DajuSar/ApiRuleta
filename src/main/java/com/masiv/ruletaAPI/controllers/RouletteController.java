package com.masiv.ruletaAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masiv.ruletaAPI.interfaceServices.IrouletteService;
import com.masiv.ruletaAPI.model.Roulette;

@Controller
@RequestMapping
public class RouletteController {

	@Autowired
	private IrouletteService rouletteService;
	@GetMapping("/rouletteList")
	public String toListRoulettes(Model model) {
		List<Roulette> roulettes = rouletteService.toList();
		model.addAttribute("roulettes", roulettes);
		
		return "roulettes";
	}
}
