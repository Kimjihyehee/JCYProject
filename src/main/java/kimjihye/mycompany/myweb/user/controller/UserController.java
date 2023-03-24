package kimjihye.mycompany.myweb.user.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kimjihye.mycompany.myweb.user.dto.UserDto;
import kimjihye.mycompany.myweb.user.service.UserService;

@Controller
@RequestMapping("/user/**")
public class UserController {

	@Autowired
	UserService userService;
	
	//회원가입 페이지 이동  0315
	@RequestMapping("/signup")
	public String create() {
		return "user/signup";
	}
	//회원가입 정보 db저장 0315
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public ModelAndView createPost(UserDto userDto) {
		ModelAndView mav = new ModelAndView();
		//DB에 암호 저장
		boolean signupTF = userService.create(userDto);
		mav.addObject(signupTF);
		mav.setViewName("/user/signin"); // 로그인 페이지로 이동
		return mav;
	}
	 
	// 로그인  _ 사용자로부터 받은 데이터가 맞는지 확인을 하고, 맞다면 세션에 값 저장하기     0316
	@RequestMapping("login")
	public ModelAndView login(UserDto userDto, ModelAndView mv,  HttpSession session){   // 어디서 파라미터로 선언하든 안에 든 세션은 , user_id와 name이 저장되어있음. 
// 파라미터로 선언한 session은 주소에 헤더로 저장되어지는, 따로 선언한 세션값설정 (추후에 페이지 접근권한등을 이 세션의 값이 있는지 없는지 등에 여부로 주기 위해, 즉,이것은 백단에서의 로그인된 상태임을 세션에 저장 시키기위해 선언)
// userDto에 저장되어있는 값은, 로그인시 입력받은 id와 password임. 
		// 사용자로부터 받은 데이터가 맞는지 확인 하는 메소드 
		String str = userService.login(userDto);   // str : 유저네임(email, pw 일치 시 존재)
		System.out.println("         + "+ str);
		System.out.println("        userDto + "+ userDto);
		if(str != null) { // 데이터가 맞다면 들고나올 텐데 그 값이 있다면 로그인 가능하다는 것. 
			session.setAttribute("user_id", userDto.getId()); // 로그인시 입력받은 
			session.setAttribute("name", str); // 유저 네임을 받아 세션에 저장
			session.setMaxInactiveInterval(60*30); //세션 유지기간 : 30분
			mv.setViewName("redirect:/common/start"); // common/start로 주소 변경 
		}else { // 로그인 실패
			mv.setViewName("user/signin"); // 로그인페이지 view
			mv.addObject("message", "error"); 
		}
		return mv;	
	}
	
	// 로그아웃  0316
	@RequestMapping("sign_out")
	public String logout(HttpSession session) {
		session.invalidate(); // 로그아웃 시 세션 초기화
		return "redirect:/common/start";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}