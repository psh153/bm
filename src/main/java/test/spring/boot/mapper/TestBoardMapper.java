package test.spring.boot.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import test.spring.boot.component.BoardDTO;

@Repository
@Mapper
public interface TestBoardMapper {
	public Integer testCount();
	public ArrayList<BoardDTO> viewTable(); 
}
