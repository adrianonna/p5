package br.edu.ifpb.pweb2.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.dao.AlunoDAO;
import br.edu.ifpb.pweb2.model.Aluno;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	AlunoDAO alunoDao;
	
	@RequestMapping("/cadastreAluno")
	public ModelAndView cadastreAluno(Aluno aluno) {
		alunoDao.gravar(aluno);
		return listeAlunos();
	}
	
	@RequestMapping("/showAlunoForm")
	public String showAlunoForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		model.addAttribute("cursoOptions", this.getCursoOption());
		return "form";
	}
	
	private Map<String, String> getCursoOption(){
		LinkedHashMap<String, String> option = new LinkedHashMap<String, String>();
		option.put("TSI", "TSI");
		option.put("Redes", "Redes");
		option.put("Eng. Elétrica", "Eng. Elétrica");
		return option;
	}
	
	@RequestMapping("/listeAlunos")
	public ModelAndView listeAlunos() {
		ModelAndView mav = new ModelAndView("lista");
		List<Aluno> alunos = alunoDao.findaAll();
		mav.addObject("alunos", alunos);
		return mav;
		
	}
}
