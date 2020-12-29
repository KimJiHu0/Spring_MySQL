package com.spring.mysql.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mysql.dao.BoardDao;
import com.spring.mysql.dto.BoardDto;

@Service
public class BoardBizImpl implements BoardBiz {

	@Autowired
	private BoardDao boarddao;
	
	@Override
	public List<BoardDto> selectList() {
		return boarddao.selectList();
	}

}
