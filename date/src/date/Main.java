package date;

import java.time.Instant;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = Date.from(Instant.parse("2020-08-02T15:42:07Z"));
		System.out.println(date);
		Date x1 = new Date();
		System.out.println(x1);
	}

}
