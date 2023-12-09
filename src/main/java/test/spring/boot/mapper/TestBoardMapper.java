package test.spring.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestBoardMapper {
	public Integer testCount();
}
