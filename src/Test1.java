import java.util.Date;

public class Test1 {
	public static void log(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		Date date = new Date(2015,10,27,9,14,0);
		if (date.getHours() >= 9 && date.getMinutes() > 15) {
			log("oeps");
		}
		if (tijdBinnenkomst <= 10) {
			log("Aanwezig");
		} else if (tijdBinnenkomst < 9.05) {
			log("Te laat");
		} else {
			log("Niet aanwezig");
		}
		
	
	}
}
