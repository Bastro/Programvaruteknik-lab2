package workshop;

import java.util.HashMap;
import java.util.Map;

import com.owlike.genson.Genson;

public class CsvToMapParser {

	private String csv;
	
	
	public CsvToMapParser(String CsvString){
		
		csv = CsvString;		
	}
	
	 public Map<String, Double> getResult() {

		 String[] temp;	
		Map<String,Double> map = new HashMap<String, Double>();
			temp=csv.split(";");
	
	
		 for (int i = 0; i < temp.length; i++) {
			 
			 
			 if(temp[i].startsWith("Y")==true){
			
				System.out.println("key "+temp[i-2]);
				System.out.println("data "+temp[i-1]);
				 map.put(temp[i-2], Double.parseDouble(temp[i-1]));
				 
			 }
			 
			
		}
		
			
	       return map;
	    }
	
}
