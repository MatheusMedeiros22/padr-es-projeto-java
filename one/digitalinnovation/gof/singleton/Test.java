package one.digitalinnovation.gof.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Testes relacionados ao Design Pattern Singleton
		
		SingletonLazy lazy = SingletonLazy.getSingletonLazy();
		System.out.println(lazy);
		lazy = SingletonLazy.getSingletonLazy();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getSingletonEager();
		System.out.println(eager);
		eager = SingletonEager.getSingletonEager();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getHolder();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getHolder();
		System.out.println(lazyHolder);
	}

}
