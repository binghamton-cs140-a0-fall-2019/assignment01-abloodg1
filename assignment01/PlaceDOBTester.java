package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {


	 public static void main (String [] args){

	DateAndPlaceOfBirth one = new DateAndPlaceOfBirth(2000, 1, 3, "Middletown", "New Jersey", 
			"USA");
	DateAndPlaceOfBirth two = new DateAndPlaceOfBirth(2000, 1, 3, "Middletown", "New York",
                        "USA");
	DateAndPlaceOfBirth three = new DateAndPlaceOfBirth(2004, 1, 3, "New York", "New York",
                        "USA");
	DateAndPlaceOfBirth four = new DateAndPlaceOfBirth(1980, 5, 20, "Tokyo", "Japan");
	DateAndPlaceOfBirth five = new DateAndPlaceOfBirth(1971, 6, 15, "Paris", "France");
	System.out.println(one.toString());
	System.out.println(two.toString());
	System.out.println(three.toString());
	System.out.println(four.toString());
	System.out.println(five.toString());
	//Checks Birthdays of all combinations
	System.out.println(one.hasSameBirthDayAs(two));
	System.out.println(one.hasSameBirthDayAs(three));
	System.out.println(one.hasSameBirthDayAs(four));
	System.out.println(one.hasSameBirthDayAs(five));
	System.out.println(two.hasSameBirthDayAs(three));
	System.out.println(two.hasSameBirthDayAs(four));
	System.out.println(two.hasSameBirthDayAs(five));
	System.out.println(three.hasSameBirthDayAs(four));
	System.out.println(three.hasSameBirthDayAs(five));
	System.out.println(four.hasSameBirthDayAs(five));
	//Checks Birthdates of all combinations
	System.out.println(one.hasSameBirthDateAs(two));
        System.out.println(one.hasSameBirthDateAs(three));
        System.out.println(one.hasSameBirthDateAs(four));
        System.out.println(one.hasSameBirthDateAs(five));
        System.out.println(two.hasSameBirthDateAs(three));
        System.out.println(two.hasSameBirthDateAs(four));
        System.out.println(two.hasSameBirthDateAs(five));
        System.out.println(three.hasSameBirthDateAs(four));
        System.out.println(three.hasSameBirthDateAs(five));
        System.out.println(four.hasSameBirthDateAs(five));
	//Checks if younger than other objects
	System.out.println(one.youngerThan(two));
        System.out.println(one.youngerThan(three));
        System.out.println(one.youngerThan(four));
        System.out.println(one.youngerThan(five));
	System.out.println(two.youngerThan(one));
        System.out.println(two.youngerThan(three));
        System.out.println(two.youngerThan(four));
        System.out.println(two.youngerThan(five));
	System.out.println(three.youngerThan(one));
	System.out.println(three.youngerThan(two));
        System.out.println(three.youngerThan(four));
        System.out.println(three.youngerThan(five));
	System.out.println(four.youngerThan(one));
	System.out.println(four.youngerThan(two));
	System.out.println(four.youngerThan(three));
        System.out.println(four.youngerThan(five));
	System.out.println(five.youngerThan(one));
        System.out.println(five.youngerThan(two));
        System.out.println(five.youngerThan(three));
        System.out.println(five.youngerThan(four));

	//Checks if older than other objects
	System.out.println(one.olderThan(two));
        System.out.println(one.olderThan(three));
        System.out.println(one.olderThan(four));
        System.out.println(one.olderThan(five));
        System.out.println(two.olderThan(one));
        System.out.println(two.olderThan(three));
        System.out.println(two.olderThan(four));
        System.out.println(two.olderThan(five));
        System.out.println(three.olderThan(one));
        System.out.println(three.olderThan(two));
        System.out.println(three.olderThan(four));
        System.out.println(three.olderThan(five));
        System.out.println(four.olderThan(one));
        System.out.println(four.olderThan(two));
        System.out.println(four.olderThan(three));
        System.out.println(four.olderThan(five));
	System.out.println(five.olderThan(one));
        System.out.println(five.olderThan(two));
        System.out.println(five.olderThan(three));
        System.out.println(five.olderThan(four));
	
	try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true))) 
	{
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

	DateAndPlaceOfBirth one2 = new DateAndPlaceOfBirth(2000, 1, 3, "Middletown", "New Jersey",
                        "USA");
        DateAndPlaceOfBirth two2 = new DateAndPlaceOfBirth(2000, 1, 3, "Middletown", "New York",
                        "USA");
        DateAndPlaceOfBirth three2 = new DateAndPlaceOfBirth(2004, 1, 3, "New York", "New York",
                        "USA");
        DateAndPlaceOfBirth four2 = new DateAndPlaceOfBirth(1980, 5, 20, "Tokyo", "Japan");
        DateAndPlaceOfBirth five2 = new DateAndPlaceOfBirth(1971, 6, 15, "Paris", "France");
	output.println(one2);
        output.println(two2);
        output.println(three2);
        output.println(four2);
        output.println(five2);
        //Checks Birthdays of all combinations
        output.println(one2.hasSameBirthDayAs(two2));
        output.println(one2.hasSameBirthDayAs(three2));
        output.println(one2.hasSameBirthDayAs(four2));
        output.println(one2.hasSameBirthDayAs(five2));
        output.println(two2.hasSameBirthDayAs(three2));
        output.println(two2.hasSameBirthDayAs(four2));
        output.println(two2.hasSameBirthDayAs(five2));
        output.println(three2.hasSameBirthDayAs(four2));
        output.println(three2.hasSameBirthDayAs(five2));
        output.println(four2.hasSameBirthDayAs(five2));
        //Checks Birthdates of all combinations
        output.println(one2.hasSameBirthDateAs(two2));
        output.println(one2.hasSameBirthDateAs(three2));
        output.println(one2.hasSameBirthDateAs(four2));
        output.println(one2.hasSameBirthDateAs(five2));
        output.println(two2.hasSameBirthDateAs(three2));
        output.println(two2.hasSameBirthDateAs(four2));
        output.println(two2.hasSameBirthDateAs(five2));
        output.println(three2.hasSameBirthDateAs(four2));
        output.println(three2.hasSameBirthDateAs(five2));
        output.println(four2.hasSameBirthDateAs(five2));
	//Checks if younger than other objects
        output.println(one2.youngerThan(two2));
        output.println(one2.youngerThan(three2));
        output.println(one2.youngerThan(four2));
        output.println(one2.youngerThan(five2));
        output.println(two2.youngerThan(one2));
        output.println(two2.youngerThan(three2));
        output.println(two2.youngerThan(four2));
        output.println(two2.youngerThan(five2));
        output.println(three2.youngerThan(one2));
        output.println(three2.youngerThan(two2));
        output.println(three2.youngerThan(four2));
        output.println(three2.youngerThan(five2));
        output.println(four2.youngerThan(one2));
        output.println(four2.youngerThan(two2));
        output.println(four2.youngerThan(three2));
        output.println(four2.youngerThan(five2));
        output.println(five2.youngerThan(one2));
        output.println(five2.youngerThan(two2));
        output.println(five2.youngerThan(three2));
        output.println(five2.youngerThan(four2));
        //Checks if older than other objects
        output.println(one2.olderThan(two2));
        output.println(one2.olderThan(three2));
        output.println(one2.olderThan(four2));
        output.println(one2.olderThan(five2));
        output.println(two2.olderThan(one2));
        output.println(two2.olderThan(three2));
        output.println(two2.olderThan(four2));
        output.println(two2.olderThan(five2));
        output.println(three2.olderThan(one2));
        output.println(three2.olderThan(two2));
        output.println(three2.olderThan(four2));
        output.println(three2.olderThan(five2));
        output.println(four2.olderThan(one2));
        output.println(four2.olderThan(two2));
        output.println(four2.olderThan(three2));
        output.println(four2.olderThan(five2));
        output.println(five2.olderThan(one2));
        output.println(five2.olderThan(two2));
        output.println(five2.olderThan(three2));
        output.println(five2.olderThan(four2));



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	 }

}
