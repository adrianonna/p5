package br.edu.ifpb.pweb2.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifpb.pweb2.model.Aluno;
import br.edu.ifpb.pweb2.repo.AlunoRepositorio;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

	@RequestMapping("/form")
	public String showAlunoForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		model.addAttribute("paisOptions", this.getPaisOption());
		model.addAttribute("linguagemOptions", this.getLinguagemOption());
		return "form";
	}
	
	@RequestMapping("/salve")
	public String cadastreAlunoBindig(Aluno aluno) {
		AlunoRepositorio.add(aluno);
		return "cadastrado";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String busqueAlunoComPathParam(@PathVariable("id") Long id, Model model) {
		Aluno aluno = AlunoRepositorio.findById(id);
		model.addAttribute("aluno", aluno);
		model.addAttribute("paisOptions", this.getPaisOption());
		model.addAttribute("linguagemOptions", this.getLinguagemOption());
		return "form";
	}

	private Map<String, String> getPaisOption(){
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		options.put("Brasil", "Brasil");
		options.put("Argentina", "Argentina");
		options.put("Colômbia", "Colômbia");
		options.put("Uruguai", "Uruguai");
		return options;
	}
	
	private Map<String, String> getLinguagemOption(){
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		options.put("Java", "Java");
		options.put("Python", "Python");
		options.put("C++", "C++");
		return options;
	}
	
}
