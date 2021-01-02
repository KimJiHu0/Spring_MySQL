package com.mysql.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.spring.dao.BoardDao;
import com.mysql.spring.dto.BoardDto;

@Controller
public class BoardController {

	@Autowired
	private BoardDao boarddao;
	
	@RequestMapping("/list.do")
	public String boardList(Model model) {
		
		List<BoardDto> list = boarddao.selectList();
		model.addAttribute("list", list);
		
		return "boardList";
	}
	
}
