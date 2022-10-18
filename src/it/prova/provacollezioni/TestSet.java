package it.prova.provacollezioni;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		// Esempio HashSet
		Set<String> prova1 = new HashSet<String>();
		prova1.add("roma");
		prova1.add("Milano");
		prova1.add("Palermo");
		prova1.add("Milano");
		System.out.println(prova1);

		prova1.remove("Milano");
		System.out.println(prova1);

	}

}
