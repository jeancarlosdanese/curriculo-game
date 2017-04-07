package io.hyberika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurriculoController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("questionario")
	public String questionario(){
		return "questionario";
	}

}
