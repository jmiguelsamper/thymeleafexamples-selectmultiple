package com.thymeleafexamples.select.dao;

import com.thymeleafexamples.select.domain.Hobby;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class HobbyDao {

	private HashMap<String, Hobby> ALL_HOBBIES = new HashMap<String, Hobby>(){{
		put("CNM", new Hobby("CNM", "Cinema"));
		put("FTB", new Hobby("FTB", "Football"));
		put("PAI", new Hobby("PAI", "Painting"));
		put("PKR", new Hobby("PKR", "Poker"));
		put("DRT", new Hobby("DRT", "Darts"));
		put("POL", new Hobby("POL", "Pool"));
		put("SWI", new Hobby("SWI", "Swimming"));
		put("OPR", new Hobby("OPR", "Opera"));
	}};

	public Collection<Hobby> findAll() {
		return ALL_HOBBIES.values();
	}

	public Hobby findOne(String id) {
		return ALL_HOBBIES.get(id);
	}
}
