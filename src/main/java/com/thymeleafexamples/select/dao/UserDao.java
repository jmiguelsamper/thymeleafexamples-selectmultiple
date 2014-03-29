package com.thymeleafexamples.select.dao;

import com.thymeleafexamples.select.domain.Hobby;
import com.thymeleafexamples.select.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {

	@Autowired HobbyDao hobbyDao;

	private final List<Hobby> DEFAULT_HOBBIES = new ArrayList<Hobby>(){{
		add(new Hobby("CNM", "Cinema"));
		add(new Hobby("PKR", "Poker"));
		add(new Hobby("SWI", "Swimming"));
	}};

	private final User MEMORY_USER = new User("USR101", DEFAULT_HOBBIES);

	public User findOne() {
		return MEMORY_USER;
	}

	public void save(User user) {
		List<Hobby> newHobbies = new ArrayList<>();
		if (user.getHobbies() != null) {
			for (Hobby hobby : user.getHobbies()) {
				newHobbies.add(hobbyDao.findOne(hobby.getId()));
			}
		}
		MEMORY_USER.setHobbies(newHobbies);
	}
}
