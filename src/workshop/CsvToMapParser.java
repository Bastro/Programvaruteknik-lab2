package workshop;

import java.util.Map;

import com.owlike.genson.Genson;

public class CsvToMapParser {

	private String csv;
	
	
	public CsvToMapParser(String CsvString){
		
		csv = CsvString;		
		 String[] temp;	
			temp=csv.split("2014");
	
			System.out.println("0 " +temp[0]);
			System.out.println("1 "+ temp[1]);
		
	}
	
	 public void getResult() {

		 String[] temp;	
			temp=csv.split("2014");
	
			System.out.println("0 " +temp[0]);
			System.out.println("1 "+ temp[1]);
			System.out.println("2 "+ temp[2]);
			System.out.println("3 "+ temp[3]);
			System.out.println("4 "+ temp[4]);
			System.out.println("5 "+ temp[5]);
			System.out.println("6 "+ temp[6]);
			System.out.println("7 "+ temp[7]);
			
	     //   return new Genson().deserialize(csv, Map.class);
	    }
	
}
