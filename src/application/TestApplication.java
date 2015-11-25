package application;

import java.util.Calendar;
import java.util.Scanner;

import data.Students;
import model.LateMoment;
import model.Student;
import model.TypeOfLate;

public class TestApplication {
	private static Scanner in = new Scanner(System.in);

	private static void log(String out) {
		System.out.println(out);
	}

	private static String getInput() {
		return in.nextLine();
	}

	public static void main(String[] args) {
		Students.fillDatabase();
		while (true) {
			log("Geef een voornaam: ");
			String voornaam = getInput();
			log("Geef een achternaam: ");
			String achternaam = getInput();
			// tussenvoegsel hebben we maar ff schijt aan
			Student s = Students.search(voornaam, achternaam);
			if (s == null) {
				log("leer eens typen");
				log("probeer het nog eens");
			} else {
				log("deze leerling is al " + s.getUnalowedLateMoments().size() + " ongeoorloofd keer te laat gekomen");
				log("is deze leerling nu te laat(ja of nee)?");
				boolean teLaat = getInput().equalsIgnoreCase("Ja");
				if (teLaat) {
					log("is het geoorloofd(ja of nee)?");
					boolean geoorloofd = getInput().equalsIgnoreCase("Ja");
					log("geef een verklaring:");
					String verklaring = getInput();
					s.addLateMoment(verklaring, geoorloofd ? TypeOfLate.ALOWED : TypeOfLate.UNALOWED);
				}
				log("klaar. op naar de volgende");
			}
		}
	}
}
