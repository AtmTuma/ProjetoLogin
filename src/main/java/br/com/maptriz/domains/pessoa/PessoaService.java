package br.com.maptriz.domains.pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaService {

	UUID create(PessoaDTO pessoaDTO);

	PessoaDTO get(UUID id);

	List<PessoaDTO> getAll();
}
