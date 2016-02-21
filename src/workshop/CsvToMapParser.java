package workshop;

import java.util.HashMap;
import java.util.Map;

import com.owlike.genson.Genson;

public class CsvToMapParser {

	private String csv;
	
	
	public CsvToMapParser(String CsvString){
		
		csv = CsvString;		
	}
	
	 public void getResult() {

		 String[] temp;	
		Map<String,String> map = new HashMap<String, String>();
			temp=csv.split(";");
	
	// fungerar inte för att den sparar inte hella Y 		
		 for (int i = 0; i < temp.length; i++) {
			 
			 
			 if(temp[i].equals("Y")){
				System.out.println("key "+temp[i-2]);
				System.out.println("data "+temp[i-1]);
				 map.put(temp[i-2], temp[i-1]);
				 
			 }
			 
			
		}
		
			
	     //   return new Genson().deserialize(csv, Map.class);
	    }
	
}
