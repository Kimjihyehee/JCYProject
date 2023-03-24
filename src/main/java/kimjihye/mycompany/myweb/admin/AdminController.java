package kimjihye.mycompany.myweb.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
//	// 모든 관리자 페이지 접근 URL로 불가 
//	// 일괄처리 안되어 메서드화 후 일괄처리.
//	public String access(HttpServletRequest request) {
//		//URL 접근 차단
//		return request.getHeader("REFERER"); 
//	}
//	 
//	//@ResponseBody : 해당페이지에서 리다이렉트가아니고 , 바로 응답해줄 때 쓰임
//	@RequestMapping("/admin")
//	@ResponseBody
//	public ModelAndView adminMain(ModelAndView mv, HttpServletRequest request, HttpSession session) {
//		//URL접근 차단 	
//		if(access(request) == null) {
//			mv.addObject("error", "잘못된 접근입니다");
//			mv.setViewName("redirect:/");
//			return mv;
//		}
//		//추가로 확실한 검증 
//		if(session.getAttribute("role") != "director" || session.getAttribute("nickname") != "manager") {
//			mv.addObject("error", "접근 권한이 없습니다");
//			mv.setViewName("redirect:/");
//		}
//		return mv;
//	}
	
	
}
