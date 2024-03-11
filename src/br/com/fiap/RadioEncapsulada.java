package br.com.fiap;

public class RadioEncapsulada {
	
	// definindo variaveis
	private int volume;
	private float estacao;
	
	// funções de volume
	public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	// get e set de volume

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;
			}
			else {
				throw new Exception("Volume fora da faixa permitida.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Estação de rádio 
	public float getEstacao() {
		return estacao;
	}

	public void setEstacao(float estacao) {
		try {
			if(estacao >= 80.0 && estacao <= 105.0) {
				this.estacao = estacao;
			}
			else {
				throw new Exception("Estação fora da faixa permitida.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void mostrar() {
		System.out.println("\n Volume: " + getVolume() + "\n Estação: " + getEstacao());
	}
}
