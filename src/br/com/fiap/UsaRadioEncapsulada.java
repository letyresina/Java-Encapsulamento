package br.com.fiap;

public class UsaRadioEncapsulada {

	public static void main(String[] args) {
		// Instanciando a classe
		RadioEncapsulada radio = new RadioEncapsulada();
		
		// usando então o set para definir os valores
		radio.setEstacao(89.1f);
		radio.setVolume(100);
		
		radio.mostrar();
		
		// testando os metodos
		radio.diminuirVolume();
		radio.diminuirVolume();
		
		radio.setEstacao(92.5f);
		
		radio.mostrar();

	}

}
