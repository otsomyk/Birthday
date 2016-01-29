package data;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Data {

	public static void main(String[] args) {
		 GregorianCalendar d = new GregorianCalendar();
	        d.set(1982, 02, 24);

	        Date date = new Date(d.getTimeInMillis());
	        SimpleDateFormat bd = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
	        
	        System.out.println("Birthday: " + bd.format(date));
	}

}
