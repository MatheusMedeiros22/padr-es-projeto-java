package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author MatheusMedeiros22
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() { //construtor privado garante que ngm instancie a classe fora dela
		super(); //
	}
	
	public static SingletonLazy getSingletonLazy() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}
}
