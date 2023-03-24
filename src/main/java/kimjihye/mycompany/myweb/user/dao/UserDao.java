package kimjihye.mycompany.myweb.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kimjihye.mycompany.myweb.user.dto.UserDto;

@Repository
public class UserDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	// 디비에 저장되면 t, 저장 안되면 f
	public boolean create(UserDto userDto) {
		sqlSessionTemplate.insert("user.insert", userDto);
		return true;
	}

	public String login(UserDto userDto) {
		// 사용자로부터 입력받은 아이디값으로 테이블을 찾아 온전히 디비에 저장되어있는 비밀번호를 가져나옴
		String pw = sqlSessionTemplate.selectOne("user.pwGet", userDto); // pw : 디비에 가져나온 비밀번호 값
		// 회원가입시 디비에 저장되어있는 유저의 비밀번호(pw)와 로그인을 위해 입력한 비밀번호가 일치할 때. 
		if(pw.equals(userDto.getPassword())) { 
			return sqlSessionTemplate.selectOne("user.login", userDto); // 네임값을 가지고 리턴
		}
		else return null; // 비밀번호 비일치시 null
	}



	
}
