package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
		
		// criando variaveis 
		int canal, volume, opcao;
		
		// instanciando classes necessárias
		Scanner scan = new Scanner(System.in);
		TelevisorEncapsulada televisor = new TelevisorEncapsulada();
		
		try {
			
			System.out.println("Canais disponíveis: 2, 4, 5, 7, 13");
			System.out.println("Defina um canal inicial");
			canal = scan.nextInt();
			
			System.out.println("Defina um volume inicial");
			volume = scan.nextInt();
			
			televisor.setCanal(canal);
			televisor.setVolume(volume);
			
			televisor.mostrar();
			
			// fazendo menu
			System.out.println("Menu de opções");
			System.out.println("\n 1 - Definir outro canal; \n 2 - Definir outro volume;"
					+ "\n 3 - Aumentar volume; \n 4 - Diminuir volume;");
			
			System.out.println("Escolha uma opção");
			opcao = scan.nextInt();
			
			if (opcao == 1){
				System.out.println("Canais disponíveis: 2, 4, 5, 7, 13");
				System.out.println("Defina o novo canal");
				canal = scan.nextInt();
				televisor.setCanal(canal);
				
				televisor.mostrar();
			}
			else if (opcao == 2) {
				System.out.println("Defina um novo volume");
				volume = scan.nextInt();
				televisor.setVolume(volume);
				
				televisor.mostrar();
			}
			else if (opcao == 3) {
				televisor.aumentarVolume();
				
				televisor.mostrar();
			}
			else if (opcao == 4) {
				televisor.diminuirVolume();
				
				televisor.mostrar();
			}
			else {
				System.out.println("Opção inválida");
			}
			
		} catch (Exception e) {
			System.out.println("Formato inválido. Tente novamente");
		}
		
		
		
	}

}
