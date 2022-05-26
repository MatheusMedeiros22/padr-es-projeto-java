package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author MatheusMedeiros22
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() { //construtor privado garante que ngm instancie a classe fora dela
		super();
	}
	
	public static SingletonEager getSingletonEager() {
		return instancia;
	}
}