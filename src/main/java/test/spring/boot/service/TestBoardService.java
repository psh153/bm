package test.spring.boot.service;

import java.util.ArrayList;

import test.spring.boot.component.BoardDTO;
import test.spring.boot.component.EmpDTO;

public interface TestBoardService {
	public Integer testCount();
	public ArrayList<BoardDTO> viewTable();
	public ArrayList<EmpDTO> testTable(); 
}
