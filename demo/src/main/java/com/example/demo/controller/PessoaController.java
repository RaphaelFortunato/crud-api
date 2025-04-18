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
import com.example.demo.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@Autowired
	PessoaService pessoaService;
	
	@PostMapping()
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}
	
	@GetMapping
	public List<Pessoa> buscarPessoas(){
		return pessoaService.listar();
	}
	
	
	@GetMapping(value = "/buscarid")
	@ResponseBody
	public ResponseEntity<Pessoa> buscarId(@RequestParam(name = "id") Long id){
			return pessoaService.buscarId(id);
	}
	
	@GetMapping("/deletar")
	@RequestMapping
	public ResponseEntity<String> deletar(@RequestParam Long id){
		
		pessoaRepository.deleteById(id);
		
		return new ResponseEntity<String>("Pessoa deletada", HttpStatus.OK);
	}

}
