package br.com.caelum.jdbc.dao.exception;

public class DaoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DaoException(String message) {
		super(message);
	}

}
