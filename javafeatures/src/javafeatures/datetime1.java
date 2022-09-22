<<<<<<< HEAD
package javafeatures;
import java.time.LocalDate;
import java.time.LocalTime;

public class datetime1 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println("today date: "+date);
		System.out.println("yesterday date: "+yesterday);
		System.out.println("tomorow date: "+tomorrow);
		System.out.println("current local date and time: "+java.time.LocalDateTime.now());
	}

}
=======
package javafeatures;
import java.time.LocalDate;
import java.time.LocalTime;

public class datetime1 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println("today date: "+date);
		System.out.println("yesterday date: "+yesterday);
		System.out.println("tomorow date: "+tomorrow);
		System.out.println("current local date and time: "+java.time.LocalDateTime.now());
	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
