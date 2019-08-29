package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester{

		public static void main (String [] args){
			
			StreetUSAddress ad1 = new StreetUSAddress("45 Princeton St.","","Red Bank","NJ","07701");
			StreetUSAddress ad2 = new StreetUSAddress("123 Main St.","Main Way","Maintown","NY","12345");
			System.out.println(ad1.toString());
			System.out.println(ad2.toString());

			try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

			StreetUSAddress ad3 = new StreetUSAddress("45 Princeton St.","","Red Bank","NJ","07701");
                        StreetUSAddress ad4 = new StreetUSAddress("123 Main St.","Main Way","Maintown","NY","12345");
                        output.println(ad3.toString());
                        output.println(ad4.toString());


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



			
		}
		
}

