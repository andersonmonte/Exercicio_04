package br.com.tinnova.avaliacao.util;

public class Calculo {
	public static int somatoriaMultiplos3e5(int valor) {
		int somatoria = 0;
		
		for (int i = 1; i < valor; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				somatoria = somatoria + i;
			}
		}
		
		return somatoria;
	}
}
