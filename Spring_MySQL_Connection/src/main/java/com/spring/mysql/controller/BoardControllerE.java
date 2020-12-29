package com.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mysql.biz.BoardBiz;
import com.spring.mysql.dto.BoardDto;

@Controller
public class BoardControllerE {
	
	@Autowired
	private BoardBiz boardbiz;

	@RequestMapping("/list.do")
	public String boardList(Model model) {
		
		List<BoardDto> list = boardbiz.selectList();
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
}
