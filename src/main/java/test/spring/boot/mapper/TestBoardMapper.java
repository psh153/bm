package test.spring.boot.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import test.spring.boot.component.BoardDTO;
import test.spring.boot.component.EmpDTO;

@Repository
@Mapper
public interface TestBoardMapper {
	public Integer testCount();
	public ArrayList<BoardDTO> viewTable();
	public ArrayList<EmpDTO> testTable(); 
}
