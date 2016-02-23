package workshop;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.owlike.genson.Genson;

public class CsvToMapParser {

	private String csv;
	
	
	public CsvToMapParser(String CsvString){
		
		csv = CsvString;		
	}
	
	 public Map<LocalDate, Double> getResult() {

		 String[] temp;	
		Map<LocalDate,Double> map = new HashMap<LocalDate, Double>();
			temp=csv.split(";");
	
		 for (int i = 0; i < temp.length; i++) {	 
			 if(temp[i].startsWith("Y")==true){
				 map.put(LocalDate.parse(temp[i-2]), Double.parseDouble(temp[i-1]));
			 }	 		
		}
		
			
	       return map;
	    }
	
}
