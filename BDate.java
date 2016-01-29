package bdate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BDate {

	public static void main(String[] args) throws Exception {

		String dateOfBirth= "24 Mar 1982";
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        Date date = dateFormat.parse(dateOfBirth);
        String output = dateFormat.format(date);
        System.out.println(output);
		
		
	}

}
