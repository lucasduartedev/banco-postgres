package com.pratica.postgres.testes;

import java.util.List;

import com.pratica.postgres.daos.PessoaDAO;
import com.pratica.postgres.models.Pessoa;

public class PessoaTesteDois {

	public static void main(String[] args) {
		
//		Pessoa pessoa = new Pessoa("");
//		DAO<Pessoa> dao = new DAO<>(Pessoa.class);
//		dao.abrirT().incluir(pessoa).fecharT();
		
		PessoaDAO dao = new PessoaDAO();
		List<Pessoa> pessoas = dao.obterTodos();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("OK");

	}

}
