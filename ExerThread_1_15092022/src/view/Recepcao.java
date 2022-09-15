package view;

import java.util.concurrent.Semaphore;

import controller.Forno;

public class Recepcao {

	public static void main(String[] args) {
		
		int permissao = 1;
		Semaphore semaforo = new Semaphore(permissao);
		for (int i = 0; i < 5 ; i++) {
			Forno cozinha = new Forno(i, i, i, semaforo);
			cozinha.start();
		}
	}

}