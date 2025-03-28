package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@PostMapping()
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@GetMapping
	public List<Pessoa> buscarPessoas(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping(value = "buscarid")
	@ResponseBody
	public ResponseEntity<Pessoa> buscarId(@RequestParam(name = "id") Long id){
		
		Pessoa pessoa = pessoaRepository.findById(id).get();
		
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
	}
	
	@GetMapping("/deletar")
	@RequestMapping
	public ResponseEntity<String> deletar(@RequestParam Long id){
		
		pessoaRepository.deleteById(id);
		
		return new ResponseEntity<String>("Pessoa deletada", HttpStatus.OK);
	}

}
