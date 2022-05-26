package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author MatheusMedeiros22
 *
 */

public class SingletonLazyHolder {
	
	private static class Holder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() { //construtor privado garante que ngm instancie a classe fora dela
		super();
	}
	
	public static SingletonLazyHolder getHolder() {
		return Holder.instancia;
	}
	
}
