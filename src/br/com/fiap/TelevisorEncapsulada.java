package br.com.fiap;

public class TelevisorEncapsulada {
	
	// definindo variaveis
	private int volume;
	private int canal;
	
	// funções de volume
		public void aumentarVolume() {
			if (volume < 20) {
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
				if (volume >= 0 && volume <= 20) {
					this.volume = volume;
				}
				else {
					throw new Exception("Volume fora da faixa permitida.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		// canal
		
		public int getCanal() {
			return canal;
		}
		
		public void setCanal(int canal) {
			try {
				if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
					this.canal = canal;
				}
				else {
					throw new Exception("Canal não encontrado.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void mostrar() {
			System.out.println("\n Volume: " + getVolume() + "\n Canal: " + getCanal());
		}
}
