package com.pratica.postgres.daos;

import com.pratica.postgres.models.Pessoa;

public class PessoaDAO extends DAO<Pessoa> {

	public PessoaDAO() {
		super(Pessoa.class);
	}
	
}
