package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {
	public static int fakultet(int n) {

		if (n == 1)
			return n;
		return n * fakultet(n - 1);
	}

	public static void main(String[] args) {

		String helTall = showInputDialog("Skriv inn et heltall:");
		int n = Integer.parseInt(helTall);
		System.out.println(n * fakultet(n - 1));

	}

}
