package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		final int ANT_STUDENTER = 10;
		for (int studentNr = 0; studentNr < ANT_STUDENTER; studentNr++) {

			String poengSum = showInputDialog("Hvor mange poeng fikk du?");
			int poeng = Integer.parseInt(poengSum);

			while (poeng < 0 || poeng > 100) {
				poengSum = showInputDialog("Feil sucker, prøv igjen?");
				poeng = Integer.parseInt(poengSum);
			}
			
			if (poeng >= 90 && poeng <= 100) {
				System.out.println("Gratulerer du har fått top karakter! A!");
			}

			else if (poeng >= 80) {
				System.out.println("Du har fått karateren B!");
			}

			else if (poeng >= 60) {
				System.out.println("Du har fått karateren C!");
			}

			else if (poeng >= 50) {
				System.out.println("Du har fått karateren D!");
			}

			else if (poeng >= 40) {
				System.out.println("Du har fått karateren E!");
			}

			else if (poeng >= 0) {
				System.out.println("Beklager du har strøket. Karakter F.");
			}

			else {
				System.out.println("Poengsummen du har skrevet inn er for høy eller for lav, prøv på nytt.");
			}
		}

	}
}
