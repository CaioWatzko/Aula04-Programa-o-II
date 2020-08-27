package com.github.CaioWatzko.Aula04.Armazem;

import java.util.ArrayList;

public class Armazem {

	public static ArrayList<O> aPar;

	public static void main(String[] args) {
		
		ArrayList aPar = new ArrayList();
		ArrayList aImpar = new ArrayList();
		
		/*não sei se foi a melhor forma de formar o array,
		mas não achei outra por enquanto, vou pesquisar mais*/
		for(int x = 0; x < 15; x++) {
			if(x % 2 == 0) {
				aPar.add(x);
			}else {
				aImpar.add(x);
			}
		}
		
		
		
	}
	
	
}
