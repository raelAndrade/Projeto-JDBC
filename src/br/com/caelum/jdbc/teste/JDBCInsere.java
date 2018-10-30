package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		
		try {
			// Conectando
			con = new ConnectionFactory().getConnection();
			
			// Cria um preparedStatement
			String sql =  "insert into contatos (nome, email, endereco, dataNascimento) values (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			//Preenche os valores
			stmt.setString(1, "Alura");
			stmt.setString(2, "contato@lura.com");
			stmt.setString(3, "R. dos Nerds 10101 Bloco 2");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
			
			// Executa
			stmt.execute();
			
			// Fecha a preparedStatement
			stmt.close();
			
			System.out.println("Gravado com sucesso!");
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			// Fecha a conexão
			con.close();
		}

	}

}
