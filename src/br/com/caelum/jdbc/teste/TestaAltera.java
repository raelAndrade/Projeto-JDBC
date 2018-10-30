package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		
		long id = 4;
		
		contato.setId(id);
		contato.setNome("Java Web");
		contato.setEmail("contato@javaweb.com.br");
		contato.setEndereco("Rua dos Maçons, 321");
		
		Calendar novaData = Calendar.getInstance();
		contato.setDataNascimento(novaData);
		
		dao.altera(contato);
	}
	
}
