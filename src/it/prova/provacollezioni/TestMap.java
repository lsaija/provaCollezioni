package it.prova.provacollezioni;

import java.util.Collections;
import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> voli=new HashMap<Integer,String>();
		voli.put(100, "Milano");
		voli.put(101,"Torino");
		voli.put(102, "Napoli");
		for(Integer key: voli.keySet()) {
			System.out.println(voli.get(key));
		}
		
		System.out.println();
		voli.remove(100);
		for(Integer key: voli.keySet()) {
			System.out.println(voli.get(key));
		}
		
	}

}
