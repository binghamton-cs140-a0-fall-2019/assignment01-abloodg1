package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SimpleDate { 

	int year,month, day;

	public static SimpleDate of(int yr, int m, int d){
		
		var returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		//SimpleDate returnValue = SimpleDate.of(yr,m,d);
		return returnValue;




	}

	public boolean before(SimpleDate other){
		
		if(this.year < other.year){
			return true;
		}
		if(this.year == other.year){
			if (this.month < other.month){
				return true;
			}
			if (this.month == other.month){
				if(this.day < other.day){
					return true;
				}else{
					return false;
				}
			}


		}

		return false;
	}	

}
