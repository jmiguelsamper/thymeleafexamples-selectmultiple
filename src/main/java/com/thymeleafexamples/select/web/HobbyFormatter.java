package com.thymeleafexamples.select.web;

import com.thymeleafexamples.select.domain.Hobby;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

public class HobbyFormatter implements Formatter<Hobby> {

	@Override
	public String print(Hobby hobby, Locale locale) {
		return hobby.getId();
	}

	@Override
	public Hobby parse(String id, Locale locale) throws ParseException {
		Hobby hobby = new Hobby();
		hobby.setId(id);
		return hobby;
	}
}
