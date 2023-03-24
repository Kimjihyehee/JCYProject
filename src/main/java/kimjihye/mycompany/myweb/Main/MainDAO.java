package kimjihye.mycompany.myweb.Main;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MainDAO {
	
	@Inject
	SqlSession sqlSession;
	
	
	
	
}
