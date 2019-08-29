package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{

	public static void main (String [] args){

		DateAndPlaceOfBirth dob = new DateAndPlaceOfBirth(2001,1,3,"Middletown","NJ","USA");
		StreetUSAddress ad = new StreetUSAddress("45 Princeton St.","","Red Bank","NJ","07701");
		Person adam = new Person("Adam","Bloodgood","1234567890",dob,ad);
		System.out.println(adam.toString());

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");
		 DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(2001,1,3,"Middletown","NJ","USA");
                StreetUSAddress ad2 = new StreetUSAddress("45 Princeton St.","","Red Bank","NJ","07701");
                Person adam2 = new Person("Adam","Bloodgood","1234567890",dob2,ad2);
                output.println(adam2.toString());

		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}



}
