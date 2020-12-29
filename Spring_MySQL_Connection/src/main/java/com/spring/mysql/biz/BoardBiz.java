package com.spring.mysql.biz;

import java.util.List;

import com.spring.mysql.dto.BoardDto;

public interface BoardBiz {
	
	public List<BoardDto> selectList();

}
