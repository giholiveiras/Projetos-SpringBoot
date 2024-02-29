package com.projetojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojpa.entities.ControleAlunos;
import com.projetojpa.repository.ControleAlunosRepository;

@Service
public class ControleAlunosService {
	private final ControleAlunosRepository controleAlunosRepository;

	@Autowired
	public ControleAlunosService (ControleAlunosRepository controleAlunosRepository) {
		this.controleAlunosRepository = controleAlunosRepository;
	}
	
	public ControleAlunos saveControleAlunos (ControleAlunos controleAlunos) {
		return controleAlunosRepository.save(controleAlunos);
	}
	
	public ControleAlunos getControleAlunosById (Long id) {
		return controleAlunosRepository.findById(id).orElse(null);
	}
	
	public List<ControleAlunos> getAllControleAlunos () {
		return controleAlunosRepository.findAll();
	}
	
	public void deleteControleAlunos(Long id) {
		controleAlunosRepository.deleteById(id); 
	}
}
