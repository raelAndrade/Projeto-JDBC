package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		// Pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Algaworks");
		contato.setEmail("contato@algaworks.com.br");
		contato.setEndereco("Rua do Desespero, 31");
		contato.setDataNascimento(Calendar.getInstance());
		
		// Grava nessas conexão
		ContatoDao dao = new ContatoDao();
		
		// método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado com sucesso!");

	}

}
