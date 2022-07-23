import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAPIDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("default date is: "+date); // this will be always the current date time stamp of my system

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		try {
			Date myDate = formatter.parse("21/07/2022 10:22:12");
			System.out.println("myDate is: "+myDate);
			System.out.println("myDate is: "+formatter.format(myDate));
			
			
			Date date1 = formatter.parse("21/07/2022 11:22:10");
			Date date2 = formatter.parse("19/06/2022 10:27:17");
			
			System.out.println("COMPARING DATES");
			if(date1.compareTo(date2) > 0) {
				System.out.println(date1);
				System.out.println("IS AFTER");
				System.out.println(date2);
			}else {
				System.out.println(date1);
				System.out.println("IS BEFORE");
				System.out.println(date2);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
