package br.com.maptriz.domains.usuario;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.util.UUID;

@Embeddable
public class UsuarioVO {

	@Column(name = "id")
	private UUID id;

	@Column(name = "password")
	private String password;

	@Column(name = "data_ultimo_login")
	private LocalDate ultimoLogin;

	public UsuarioVO(String password) {
		this.id = UUID.randomUUID();
		this.password = password;
	}
}
