package pacote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();

		List listaImutavel = Collections.unmodifiableList(lista);

		List<String> listaNaoVazia = new ArrayList<String>();

		listaNaoVazia.add("Matheus");
		listaNaoVazia.add("Hello");

		List listaImutavel2 = Collections.unmodifiableList(listaNaoVazia);

		System.out.println(listaImutavel);
		System.out.println(listaImutavel2);
	}

}
