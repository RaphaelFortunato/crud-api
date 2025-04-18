package com.example.demo.service;

import java.net.ResponseCache;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository repository;
	
	public Pessoa salvar(Pessoa pessoa) {
		
		System.out.println("Executando tarefa");
		return repository.save(pessoa);
	}
	
	public List<Pessoa> listar(){
		return repository.findAll();
	}
	
	public ResponseEntity<Pessoa> buscarId(@RequestParam(name = "id") Long id){
		
		Pessoa pessoa = repository.findById(id).get();
		
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
		
	}
	
}
