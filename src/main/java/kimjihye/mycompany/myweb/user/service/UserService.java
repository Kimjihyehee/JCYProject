package kimjihye.mycompany.myweb.user.service;

import kimjihye.mycompany.myweb.user.dto.UserDto;


public interface UserService {

	// 회원가입 _db 저장
	boolean create(UserDto userDto);
	
	// 로그인을 위해 사용자로부터 받은 데이터가 맞는지 확인 0316
	String login(UserDto userDto);


}
