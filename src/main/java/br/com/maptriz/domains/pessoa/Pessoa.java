package br.com.maptriz.domains.pessoa;

import br.com.maptriz.domains.usuario.UsuarioVO;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Pessoa {

	private static final Integer DELETED = 1;

	private static final Integer UNDELETED = 0;

	@Column(name = "id")
	private UUID id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "data_nascimento")
	private LocalDate dataNasc;

	@Column(name = "deleted")
	private Integer deleted;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "usuario", joinColumns = @JoinColumn(name = "pessoa_id"))
	private UsuarioVO usuario;

	public Pessoa(String nome, String cpf, LocalDate dataNasc, String senha) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.deleted = UNDELETED;
		this.usuario = new UsuarioVO(senha);
	}
}
