package br.com.fiap;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
		TelevisorEncapsulada televisor = new TelevisorEncapsulada();
		
		televisor.setCanal(4);
		televisor.setVolume(20);
		
		televisor.mostrar();
		
		televisor.setCanal(20);
		televisor.mostrar();
		
		televisor.aumentarVolume();
		televisor.mostrar();

	}

}
