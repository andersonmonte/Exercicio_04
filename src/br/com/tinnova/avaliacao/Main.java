package br.com.tinnova.avaliacao;

import br.com.tinnova.avaliacao.util.Calculo;

public class Main {

	public static void main(String[] args) {
		int valor = 10;
		System.out.println("Somatória dos múltiplos de 3 ou 5 para o valor "
				+ valor + " = " + Calculo.somatoriaMultiplos3e5(valor));
	}

}
