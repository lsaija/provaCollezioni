package it.prova.provacollezioni;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIoFile {

	public static void main(String[] args) {
		String path = "/home/loris/provafile.txt";
		try {
			File file=new File(path);
			FileWriter fw= new FileWriter(path);
			BufferedWriter bw =new BufferedWriter(fw);
			bw.write("Questa è una prova");
			bw.flush();
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

		char[] in=new char[50];
		int size=0;
		try {
			File file=new File(path);
			FileReader fr=new FileReader(file);
			size=fr.read(in);
			System.out.println("Caratteri presenti:"+size);
			System.out.println("Il contenuto è:");
			for(int i=0;i<size;i++) {
				System.out.println(in[i]);
			}
			System.out.println(in);
			fr.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
