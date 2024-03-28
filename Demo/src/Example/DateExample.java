package Example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateExample {
public static void main(String[] args) {
//	LocalDate d=LocalDate.now();
//	LocalDate d=LocalDate.of(1996,8,15);
	LocalTime d=LocalTime.now(ZoneId.of("GMT"));
//	LocalTime d=LocalTime.of(12,51,10,999);

	System.out.println(d);
} 
}
