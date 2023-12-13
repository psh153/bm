package test.spring.boot.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.spring.boot.component.BoardDTO;
import test.spring.boot.mapper.TestBoardMapper;

@Service
public class TestBoardServiceImpl implements TestBoardService{
	@Autowired
	TestBoardMapper mapper;
	
	@Override
	public Integer testCount() {
		return mapper.testCount();
	}

	@Override
	public ArrayList<BoardDTO> viewTable() {
		return mapper.viewTable();
	}


}
