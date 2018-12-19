package br.com.maptriz.domains.pessoa;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class PessoaDTO {

	private String nome;
	private String cpf;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataNasc;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
