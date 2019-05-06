package com.lala;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotResource {

	@RequestMapping("/bot")
	public List<Bot> getBot()
	{
		List<Bot> bot=new ArrayList<>();
		
		Bot b1=new Bot();
		b1.setBid(101);
		b1.setBname("umar");
		b1.setBprice("200");
		
		bot.add(b1);
		
		return bot;
	}
	
}
