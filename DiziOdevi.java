package ders.tekrari2.com;

import java.util.Random;
import java.util.Scanner;

public class DiziOdevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String harfler = "ABCDEFGHIJKLMNOPRSTUVYZ";
		char[] alfabe = new char[harfler.length()];

		Scanner karakter = new Scanner(System.in);
		System.out.println("Kaç karakterli bir kelime istiyorsunuz: ");
		int karakterSayisi = karakter.nextInt();
		System.out.println("Kaç tane kelime üretmek istiyorsunuz: ");
		int kelimeSayisi = karakter.nextInt();

		for (int i = 0; i < harfler.length(); i++) {

			alfabe[i] = harfler.charAt(i);

		}

Random rastgele = new Random();
char [][] Dizi = new char[kelimeSayisi][karakterSayisi];

		for (int j = 0; j < kelimeSayisi; j++) {
			for (int k = 0; k < karakterSayisi; k++) {
				int uret = rastgele.nextInt(harfler.length());
				Dizi[j][k]= alfabe[uret];
				
			}
			System.out.println(Dizi[j]);
			
		}
		
	}

	
}
