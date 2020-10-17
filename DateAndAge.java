import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndAge {
	
	public static Integer[] calculateAge(LocalDate dateOfBirth) {			
		LocalDate now = LocalDate.now();
		LocalDate reference = now.minusDays(1);
		Period diference = Period.between(now, dateOfBirth);
		
		int years = Math.abs(diference.getYears());
		int months = Math.abs(diference.getMonths());
		int days = Math.abs(diference.getDays());
						
		return new Integer[] {years, months, days};
		 
	}
	
	
	public static Date calculateDate (int years, int months, int days) {
		LocalDate now = LocalDate.now(ZoneId.systemDefault());
		int localDay;
		if ((months == 1 || months == 3) && days-1 > now.getDayOfMonth()) {
			localDay = days - 1;
		}
		else if ((months == 5) && days-2 > now.getDayOfMonth()) {
			localDay = days - 2;
		}
		else {
			localDay = days;
		}
		Period datePeriod = Period.of(years, months, localDay);
		
		LocalDate localDateOfBirth = now.minus(datePeriod);
		Date dateOfBirth = Date.from(localDateOfBirth.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		localDateOfBirth.getDayOfMonth();
		return dateOfBirth;
		
		
	}
	
	public static LocalDate calculateDate2 (int years, int months, int days) {
		Period datePeriod = Period.of(years, months, days);
		LocalDate now = LocalDate.now(ZoneId.systemDefault());
		LocalDate dateOfBirth = now.minus(datePeriod);
				
		return dateOfBirth;
	}
	
	public static void main (String [] args) throws ParseException {
		//CalcularEdad calcular = new CalcularEdad();
		//Date fechaReferencia = new Date();
		
		int years = 0;
		int months = 0;
		int days = 0;
			
		// - - - - - - - - - - TEST CONSECUTIVE AGES STARTING WITH A REFERENCE DATE UNTIL AN END DATE - - - - - - - - - - - - - -
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = formatter.parse("1921-01-01");
		Date endDate = formatter.parse("2020-31-12");
		int errors = 0;
		int pass = 0;
		int total = 0;

		Calendar start = new GregorianCalendar();
		start.setTime(startDate);
		
		Calendar end = new GregorianCalendar();
		end.setTime(endDate);

		for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		    // Do your job here with `date`.
			Calendar customDate = Calendar.getInstance();
			customDate.setTime(date);
			
			//You can play with the final age in year here
			years = 2022 - start.get(Calendar.YEAR); 
			months = start.get(Calendar.MONTH);
			days = start.get(Calendar.DAY_OF_MONTH);
			
			LocalDate referenceDate = calculateDate2(years, months, days);
			Integer estimatedAge [] = calculateAge(referenceDate);
			if(years != estimatedAge [0] || months != estimatedAge[1] || days != estimatedAge[2]) {
				Period inAge = Period.of(years, months, days);
				LocalDate inDate = LocalDate.now().minus(inAge);
				Period outAge = Period.of(estimatedAge[0], estimatedAge[1], estimatedAge[2]);
				LocalDate outDate = LocalDate.now().minus(outAge);
				Period diference = Period.between(inDate, outDate);
				
				if(diference.getDays() <=1 && diference.getMonths() == 0 && diference.getYears() == 0) {
					pass++;
				}
				else {
					errors++;
				}				
					    
			}
			else {
				pass++;
				//System.out.println("P A S S    -    Años: " + edad + "    Meses: " + meses + "    Días: " + dias );
			}
		    
		}
		total = errors + pass;
		System.out.println("Total ages test: " + total);
		System.out.println("Errors: " + errors + " - " + (((float)errors/total)*100) + "%");
		System.out.println("Pass: " + pass + " - " + (((float)pass/total)*100) + "%");
		
		
	}

}
