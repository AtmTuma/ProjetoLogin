package br.com.maptriz.domains.pessoa;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Override
	public UUID create(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa(
			pessoaDTO.getNome(),
			pessoaDTO.getCpf(),
			pessoaDTO.getDataNasc(),
			pessoaDTO.getSenha());

		return null;
	}

	@Override
	public PessoaDTO get(UUID id) {
		return null;
	}

	@Override
	public List<PessoaDTO> getAll() {
		return null;
	}
}
