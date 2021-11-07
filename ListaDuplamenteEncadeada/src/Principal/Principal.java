package Principal;

import java.util.Scanner;

import Lista.ListaDuplamente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaDuplamente lista = new ListaDuplamente();
		Scanner in = new Scanner(System.in);
		
		for(int cont = 0; cont<3; cont++) {
			lista.adicionaComeco(in.next());
		}
		
		lista.imprimir();
		
		lista.adiciona(in.next());
		
		lista.imprimir();
	}

}
