package br.com.maptriz.controller;

import br.com.maptriz.domains.login.LoginDTO;
import br.com.maptriz.domains.pessoa.PessoaDTO;
import br.com.maptriz.domains.pessoa.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/pessoa")
public class UsuarioController {

	@Autowired
	private PessoaService pessoaService;

	@PostMapping("/login")
	ResponseEntity login(@RequestBody LoginDTO login) {
		return ResponseEntity.ok().build();
	}

	@PostMapping
	ResponseEntity create(@RequestBody PessoaDTO pessoaDTO) {
		UUID id = pessoaService.create(pessoaDTO);
		HttpHeaders headers = new HttpHeaders();
		ControllerLinkBuilder linkBuilder = linkTo(methodOn(UsuarioController.class).get(id));
		headers.setLocation(linkBuilder.toUri());
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	ResponseEntity get(@PathVariable("id") UUID id) {
		return ResponseEntity.ok(pessoaService.get(id));
	}

	@GetMapping
	ResponseEntity getAll() {
		return ResponseEntity.ok(pessoaService.getAll());
	}
}
