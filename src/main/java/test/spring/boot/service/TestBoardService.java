package test.spring.boot.service;

import java.util.ArrayList;

import test.spring.boot.component.BoardDTO;

public interface TestBoardService {
	public Integer testCount();
	public ArrayList<BoardDTO> viewTable();
}
