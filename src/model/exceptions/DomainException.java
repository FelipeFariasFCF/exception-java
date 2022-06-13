package model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	// RuntimeException retira a obrigatoriedade para tratamento de excecoes
	// exception obriga a tratar as excecoes

	public DomainException(String msg) {
		super(msg);
	}
}