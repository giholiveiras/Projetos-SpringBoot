package com.projetojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojpa.entities.ControleAlunos;
import com.projetojpa.service.ControleAlunosService;

@RestController
@RequestMapping ("/alunos")
public class ControleAlunosController {
	private final ControleAlunosService controleAlunosService;
	
	@Autowired
	public ControleAlunosController (ControleAlunosService controleAlunosService) {
		this.controleAlunosService = controleAlunosService;
	}
	
	@PostMapping
	public ControleAlunos createControl (@RequestBody ControleAlunos controleAlunos) {
		return controleAlunosService.saveControleAlunos(controleAlunos);
}
	@GetMapping ("/{id}")
	public ControleAlunos getControleAlunos (@PathVariable Long id) {
		return controleAlunosService.getControleAlunosById(id);
}
	
	@GetMapping ()
	public List <ControleAlunos> getAllControleAlunos () {
		return controleAlunosService.getAllControleAlunos();
}
	
	@DeleteMapping ("/{id}")
	public void deleteControleAlunos (@PathVariable Long id) {
		controleAlunosService.deleteControleAlunos(id);
}
}
	
