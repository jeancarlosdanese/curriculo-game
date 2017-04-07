package io.hyberika;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurriculoController {
	
	private Integer pontos = 0;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("questionario")
	public String questionario(){
		return "questionario";
	}
	
	@RequestMapping(value = "enviar", method = RequestMethod.POST )
	public String salvar(
			@RequestParam("nome") String nome,
			@RequestParam("quest-1") String quest1, Model model){
		
		if(quest1.equals("true")) {
			pontos++;
		}
		
		model.addAttribute("pontos", pontos);
		
		return "resultado";
		
	}

}
