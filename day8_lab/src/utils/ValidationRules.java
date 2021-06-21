package utils;
import java.util.Date;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.customer.app.*;
import custom_exception.CustomerException;
public class ValidationRules {
 public static final String REGEX;
 public static final int PASSWORD_MAX;
 public static final int PASSWORD_MIN;
 private static final String date_string="01-01-1995";
 private static Date date2;
private static SimpleDateFormat formatter;
static {
	REGEX = "^.+[@]{1}.*.com$";
	PASSWORD_MAX=10;
	PASSWORD_MIN=4;
	formatter = new SimpleDateFormat("dd-MM-yyyy");
	try {
		date2 = formatter.parse(date_string);
	} catch (ParseException e) {
		e.printStackTrace();
	}
}
public static void ValidateEmail(String email) {
	Pattern p = Pattern.compile(REGEX);
	Matcher m = p.matcher(email);
	if(!m.matches()) {
		throw new CustomerException("Invalid email");
	}
}		 
public static void ValidatePassword(String password) {
	if(password.length()<PASSWORD_MIN || password.length()>PASSWORD_MAX) {
		throw new CustomerException("Invalid password it should be between 4-10") ;
	}

} 
public static void ValidateRegAmount(double regAmount) {
	if((regAmount%500)!=0) {
		throw new CustomerException("regAMount should be in multiple of 500");
	}
} 
public static void validateDob(Date date) {
	if(date2.compareTo(date)>0) {
		throw new CustomerException("date cannot be before 01-01-1995");
	}
}
public static void validateDuplication(Customer[] cus,Customer newCus) {
	for(Customer c : cus) {
		if(newCus.getEmail().equals(c.getEmail())) {
			throw new CustomerException("Duplicate user");
		}
	}
	
	}



























}
