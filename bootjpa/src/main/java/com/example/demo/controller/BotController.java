package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BotDao;
import com.example.demo.model.Bot2;
import com.example.demo.repository.BotRepository;

@RestController
@RequestMapping("/test")
public class BotController {
    @Autowired
	BotDao botdao;
    
	
	@PostMapping("/bots")
	public Bot2 createBot(@Valid @RequestBody Bot2 bot) {
		return botdao.save(bot);
	}
	
	@GetMapping("/getbots")
	public Iterable<Bot2> getBots() 
	{
		System.out.println(botdao.findAll());
		return botdao.findAll();
	}
	
	@GetMapping("/getbot/{bid}")
	public ResponseEntity getBot(@PathVariable(value="bid") Long bid) 
	{
		Optional<Bot2> bot= botdao.findOne(bid);
		if(bot==null) {
			return ResponseEntity.notFound().build();
		}
		 return ResponseEntity.ok().body(bot);
		
	}
	
	
	
	

}
