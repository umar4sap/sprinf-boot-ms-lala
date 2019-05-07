package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bot2;
import com.example.demo.repository.BotRepository;

@Service
public class BotDao {
	
	@Autowired
	BotRepository BotRepo;
  
	public Bot2 save(Bot2 bot) {
		return BotRepo.save(bot);
	}
     
	public Iterable<Bot2> findAll() {
		return BotRepo.findAll();
	}
	public Optional<Bot2> findOne(Long bid) {
		return BotRepo.findById(bid);
		
	}
	public void delete(Long bid) {
		 BotRepo.deleteById(bid);
		
	}
	
}
