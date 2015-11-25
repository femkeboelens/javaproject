package util;

import java.util.Calendar;
/**
 * Util(afkorting voor utilities)
 * Hierin kun je handige methods zetten die je vaak nodig gaat hebben
 * @author Laptop
 *
 */
public class Util {
	/**
	 * Compares date with hour/minute.
	 * @param d
	 * @param hour
	 * @param min
	 * @return true als leerling op tijd is en anders false
	 */
	public static boolean compareDate(Calendar d, int hour, int min) {
		// te gebruiken als: compareDate(new Calendar(), 8, 15);
		// new Calendar() geeft huidige datum/tijd
		// d.get(Calendar....) geeft bepaalde waardes: uur vd dag, minuut in een uur, maandnummer etc...
		return d.get(Calendar.HOUR_OF_DAY) < hour || d.get(Calendar.MINUTE) <= min;
	}
}
