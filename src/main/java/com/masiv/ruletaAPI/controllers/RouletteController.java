package com.masiv.ruletaAPI.controllers;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masiv.ruletaAPI.interfaceServices.IrouletteService;
import com.masiv.ruletaAPI.model.Roulette;

@RestController
@RequestMapping
public class RouletteController {

	@Autowired
	private IrouletteService rouletteService;
	@GetMapping("/roulettesList")
	public List<Roulette> toListRoulettes() {
		List<Roulette> roulettes = rouletteService.toList();
		
		return roulettes;
	}
	
	@PostMapping("/saveRoulette")
	public int save(@RequestBody Roulette roulette) {
		return rouletteService.save(roulette);
	}
}
