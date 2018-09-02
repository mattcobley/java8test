package Java8Test;

import java.time.LocalDateTime;
import java.time.Month;

public class Java8DateTime {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString());
		
		Month month = localDateTime.getMonth();
		int day = localDateTime.getDayOfMonth();
		int seconds = localDateTime.getSecond();
		
		//plus a load of other things...
	}

}
