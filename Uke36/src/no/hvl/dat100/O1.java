package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		String bruttoLonn = showInputDialog("Hva er din bruttolønn? ");
		int lonn = Integer.parseInt(bruttoLonn);

		double trinn = 0;
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.132;
		double trinn4 = 0.162;


		if (lonn <= 184800 && lonn >= 0) {
		showMessageDialog(null, "Din trinnskatt er " + lonn * trinn);
		}

		else if (lonn <= 260100 && lonn >= 184800) {
		showMessageDialog(null, "Din trinnskatt er " + lonn * trinn1);
		}

		else if (lonn <= 651250 && lonn >= 260100) {
		showMessageDialog(null, "Din trinnskatt er " + lonn * trinn2);
		}

		else if (lonn <= 1021550 && lonn >= 651250) {
		showMessageDialog(null, "Din trinnskatt er " + lonn * trinn3);
		}

		else if (lonn >= 1021550) {
		showMessageDialog(null, "Din trinnskatt er "+ lonn * trinn4);
	}
}
}