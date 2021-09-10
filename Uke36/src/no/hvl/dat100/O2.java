package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		final int ANT_STUDENTER = 10;
		for (int studentNr = 0; studentNr < ANT_STUDENTER; studentNr++) {

			String poengSum = showInputDialog("Hvor mange poeng fikk du?");
			int poeng = Integer.parseInt(poengSum);

			while (poeng < 0 || poeng > 100) {
				poengSum = showInputDialog("Feil sucker, pr�v igjen?");
				poeng = Integer.parseInt(poengSum);
			}
			
			if (poeng >= 90 && poeng <= 100) {
				System.out.println("Gratulerer du har f�tt top karakter! A!");
			}

			else if (poeng >= 80) {
				System.out.println("Du har f�tt karateren B!");
			}

			else if (poeng >= 60) {
				System.out.println("Du har f�tt karateren C!");
			}

			else if (poeng >= 50) {
				System.out.println("Du har f�tt karateren D!");
			}

			else if (poeng >= 40) {
				System.out.println("Du har f�tt karateren E!");
			}

			else if (poeng >= 0) {
				System.out.println("Beklager du har str�ket. Karakter F.");
			}

			else {
				System.out.println("Poengsummen du har skrevet inn er for h�y eller for lav, pr�v p� nytt.");
			}
		}

	}
}
