package com.mysql.spring.dao;

import java.util.List;

import com.mysql.spring.dto.BoardDto;

public interface BoardDao {
	
	String NAMESPACE = "board-mapper.";
	
	public List<BoardDto> selectList();

}
