package one.digitalinnovation.gof.strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comportamento normal = new ComportamentoNormal(); 
		Comportamento defensivo = new ComportamentoDefensivo(); 
		Comportamento agressivo = new ComportamentoAgressivo(); 
		
		Robo robo = new Robo();
		robo.setStrategy(agressivo);
		
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
	}

}
