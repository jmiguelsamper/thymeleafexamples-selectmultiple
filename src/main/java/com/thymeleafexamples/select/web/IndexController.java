package com.thymeleafexamples.select.web;

import com.thymeleafexamples.select.dao.HobbyDao;
import com.thymeleafexamples.select.dao.UserDao;
import com.thymeleafexamples.select.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@Autowired UserDao userDao;
	@Autowired HobbyDao hobbyDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("user", userDao.findOne());
		return "index";
	}

	@RequestMapping(value = "/editSelect", method = RequestMethod.GET)
	public String editSelect(Model model) {
		model.addAttribute("user", userDao.findOne());
		model.addAttribute("allHobbies", hobbyDao.findAll());
		return "editSelect";
	}

	@RequestMapping(value = "/editCheckbox", method = RequestMethod.GET)
	public String editCheckbox(Model model) {
		model.addAttribute("user", userDao.findOne());
		model.addAttribute("allHobbies", hobbyDao.findAll());
		return "editCheckbox";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(User user) {
		userDao.save(user);
		return "redirect:/";
	}
}
