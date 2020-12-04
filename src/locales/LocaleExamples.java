package locales;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Locale.Builder;

public class LocaleExamples {
	
	static Locale buildLocale() {
		return new Builder().setLanguage("de").setScript("Latn").build();
	}

	public static void main(String[] args) {
		double myNumber = 1234.5678;
		LocalDateTime now = LocalDateTime.now();
		Locale l = buildLocale();
		NumberFormat defaultFormat = NumberFormat.getInstance();
		DateTimeFormatter defaultDateFormatter = DateTimeFormatter.ofPattern("yyyy MMMM dd");
		DateTimeFormatter defaultWithTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		System.out.println("Date-Time locale default format: " + defaultDateFormatter.format(now));
		System.out.println("ISO_LOCAL_DATE_TIME format: " + defaultWithTimeFormatter.format(now));
		System.out.println("Default format: " + defaultFormat.format(myNumber));
		NumberFormat germanFormat = NumberFormat.getInstance(l);
		DateTimeFormatter germanDateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(l);
		System.out.println("German date-time format: " + germanDateTimeFormatter.format(now));
		System.out.println("German number format: " + germanFormat.format(myNumber));
		NumberFormat percentGerman = NumberFormat.getPercentInstance(l);
		System.out.println("German percent format: " + percentGerman.format(0.334));
		Locale mexico = new Locale("es_MX");
		System.out.println("Mexican format: " + NumberFormat.getInstance(mexico).format(myNumber));
		System.out.println("Mexican currency format: " + NumberFormat.getCurrencyInstance(mexico).format(myNumber));
		
		DateTimeFormatter dtf 
			= DateTimeFormatter.ofPattern("eeee d'st day of' MMMM yyyy"); 
		String s = dtf.format(now);
		System.out.println("practice exam 16 format: " + s);
		
	}

}
