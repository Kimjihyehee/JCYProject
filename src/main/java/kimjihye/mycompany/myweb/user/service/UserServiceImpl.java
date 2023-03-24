package kimjihye.mycompany.myweb.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kimjihye.mycompany.myweb.user.dao.UserDao;
import kimjihye.mycompany.myweb.user.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	//회원가입_ 디비저장
	@Override
	public boolean create(UserDto userDto) {
		return userDao.create(userDto);
	}
	//로그인   0316
	@Override
	public String login(UserDto userDto) {
		return userDao.login(userDto);
	}



}
