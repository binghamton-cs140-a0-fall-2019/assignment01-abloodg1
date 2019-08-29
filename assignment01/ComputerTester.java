package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {

	public static void main (String [] args){
		Computer comp1 = new Computer("Apple", "MacBookPro", 8, 2056, true, 2000);
		Computer comp2 = new Computer("Apple", "MacBook", 8, 500, false, 800);
		Computer comp3 = new Computer("Microsoft", "SurfacePro", 8, 2056, false, 2000);
		Computer comp4 = new Computer("Microsoft", "Surface", 8, 500, true, 1400);
		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);
			try(var output = new PrintWriter(new FileOutputStream(
							new File("output.txt"), true)))
	{
				output.println("\nTESTS FOR Computer.java:");

		Computer comp5 = new Computer("Apple", "MacBookPro", 8, 2056, true, 2000);
                Computer comp6 = new Computer("Apple", "MacBook", 8, 500, false, 800);
                Computer comp7 = new Computer("Microsoft", "SurfacePro", 8, 2056, false, 2000);
                Computer comp8 = new Computer("Microsoft", "Surface", 8, 500, true, 1400);
                output.println(comp5);
                output.println(comp6);
                output.println(comp7);
                output.println(comp8);
              
       
                                output.println("\nTESTS FOR Computer.java:");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}

	}



}
