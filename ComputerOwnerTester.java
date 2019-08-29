package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{

        public static void main (String [] args){

                DateAndPlaceOfBirth dob = new DateAndPlaceOfBirth(2001,1,3,"Middletown","NJ","USA");
                StreetUSAddress ad = new StreetUSAddress("45 Princeton St.","","Red Bank","NJ","07701");
                Person adam = new Person("Adam","Bloodgood","1234567890",dob,ad);

		ComputerOwner owner = new ComputerOwner(adam);
		Computer comp1 = new Computer("Apple", "MacBookPro", 8, 2056, true, 2000);		 
		owner.addComputer(comp1);
                Computer comp2 = new Computer("Apple", "MacBook", 8, 500, false, 800);
                owner.addComputer(comp2);
		Computer comp3 = new Computer("Microsoft", "SurfacePro", 8, 2056, false, 2000);
                owner.addComputer(comp3);
		Computer comp4 = new Computer("Microsoft", "Surface", 8, 500, true, 1400);
		owner.addComputer(comp4);

                System.out.println(owner.toString());

		owner.removeComputer(1);
		owner.removeComputer(2);

		System.out.println(owner.toString());

                try(var output =new PrintWriter(new FileOutputStream(
                            new File("output.txt"), true /* true means append to file */))) {
                        output.println("\nTESTS FOR ComputerOwnerTester.java:");
               
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(2001,1,3,"Middletown","NJ","USA");
                StreetUSAddress ad2 = new StreetUSAddress("45 Princeton St.","","Red Bank","NJ","07701");
                Person adam2 = new Person("Adam","Bloodgood","1234567890",dob2,ad2);

                ComputerOwner owner2 = new ComputerOwner(adam2);
                Computer comp5 = new Computer("Apple", "MacBookPro", 8, 2056, true, 2000);
                owner2.addComputer(comp5);
                Computer comp6 = new Computer("Apple", "MacBook", 8, 500, false, 800);
                owner2.addComputer(comp6);
                Computer comp7 = new Computer("Microsoft", "SurfacePro", 8, 2056, false, 2000);
                owner2.addComputer(comp7);
                Computer comp8 = new Computer("Microsoft", "Surface", 8, 500, true, 1400);
                owner2.addComputer(comp8);

                output.println(owner2.toString());

		owner2.removeComputer(1);
                owner2.removeComputer(2);

                output.println(owner2.toString());


                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }

        }



}


