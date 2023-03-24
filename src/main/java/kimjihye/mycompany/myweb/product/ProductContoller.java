package kimjihye.mycompany.myweb.product;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/product/**")
public class ProductContoller {

	@Autowired
	ProductService productService;

	// 책 소개 목록 
	// 책 작성페이지창 띄우기
	@RequestMapping("write")
	public String write() {
		return "product/create";
	}


	// 책 작성페이지에서 DB에 값 insert(추가)하기 
	@RequestMapping(value="insert")
	public String insert(ProductDTO dto, HttpServletRequest request) {  
// HttpServletRequest : 세션정보관리를 위한 인터페이스로, HttpSession은 HttpServletRequest객체를 통해 사용됨. 
// 즉, HttpServletRequest 객체의 getSession() 메서드를 호출하여 HttpSession 객체를 얻을 수 있다.
// 이미 dto에 create페이지에서 받은 물품정보들이 저장되어 있음.(filename은  null인 상황)	
		// img ( 첨부파일 )과 함께 보냄. 
		String filename = "-";
		//System.out.println("      dto내용물? "+ dto.toString());
		// 파일이 있을 경우에만 저장하도록 처리
		if(!dto.getImage().isEmpty()) {// 물품작성페이지에서 첨부파일을 넣어, dto에 image값이 있을 경우 
			// image의 값을 가공하여 filename을 dto에 넣어준다. 
			filename = dto.getImage().getOriginalFilename(); // 파일의 진짜 이름 : OriginalFilename    // 출력시, "브라우저에 저장되어있는 실제 파일명.확장자" 로 되어 저장 
			//System.out.println("       졔filename : "+ filename);
			try {
				// ServletContext : 클래스   request : 메소드 (요청받을 수 있도록)
				// 세션으로부터 서블릿 정보를 얻어와 application에 담기. 
				//System.out.println("       졔requestgetServletContext : "+ request.getSession().getServletContext().toString());
				ServletContext application = request.getSession().getServletContext();
				//System.out.println("       졔application : "+ application);
				// 경로 가져오기 (bean추가 - 'servlet-context.xml' location 이때, 파일 생성은 직접해야함.(?!)) 
				String path = application.getRealPath("/WEB-INF/views/images");
				//System.out.println("       졔path : "+ path);
				// File이라는 클래스로 디렉토리 생성해 경로넣기.- 추후 경로를 통해 이미지 띄움 
				new File(path).mkdir();
				
				dto.getImage().transferTo(new File(path+filename));  // 여기서 try catch로 묶어야함.
				//System.out.println("          이미지 변환__dto의 getImage : " + dto.getImage());
				//System.out.println("         dto의 filename 최종 : " + filename);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
// 
		}// if end___
		//System.out.println("       졔path이후 : "+ dto.getImage());
		dto.setFilename(filename); // dto에 가공하여 얻은 filename을 set 
		//System.out.println("       졔filename이후 : "+ dto.getFilename());
		productService.insert(dto); // dto db에 저장 
		return "redirect:/list";
	}
	
	
	@RequestMapping(value="/list")
	public ModelAndView list(ModelAndView mv) {
		// DB에 있는 정보 가져오기
		mv.addObject("list", productService.list());
		mv.setViewName("/product/list");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
