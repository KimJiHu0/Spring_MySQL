package com.spring.mysql.dao;

import java.util.List;

import com.spring.mysql.dto.BoardDto;

public interface BoardDao {
	
	String NAMESPACE = "board-mapper.";
	
	public List<BoardDto> selectList();

}
