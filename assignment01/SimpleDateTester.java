package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class SimpleDateTester {

	static SimpleDate date1;
        static SimpleDate date2;
	static SimpleDate date3;


	public static void main (String [] args){

		date1 = SimpleDate.of(2001,1,3);
		date2 = SimpleDate.of(1994,6,14);
		date3 = SimpleDate.of(1994,6,14);
		System.out.println(date1.before(date2)); //should print false
		System.out.println(date2.before(date1));  //should print true
		System.out.println(date3.before(date2)); //should print false since they are the same date and do not come before the other


	}
}

