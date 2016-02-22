package workshop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Text;

public class TemperatureSource implements DataSource {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<LocalDate, Double> getValues() {
		 UrlFetcher csvFetcher = new UrlFetcher("http://opendata-download-metobs.smhi.se/explore/zip?parameterIds=2&stationId=107420&period=corrected-archive&includeMetadata=false");
		 CsvToMapParser parsed = new CsvToMapParser(csvFetcher.getContent());
		Map<String,Double> data = parsed.getResult( );
		Map<LocalDate,Double> result = new HashMap<LocalDate, Double>();
		for(int i =0; i<data.size();i++){
			
			result.put(LocalDate.parse(data.keySet().toString()),data.get(data.keySet().toString()));
			
		}
		
		 System.out.println("hej"+result.get("2014-01-01"));
		
		
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("H:/datalektioner/Programvayteknit tillbehör/tempData.csv"));
		
			String line = "";
			String cvsSplitBy = ";";
			String[] country = null;
			while ((line = br.readLine()) != null) {

				country = line.split(cvsSplitBy);
			
			
		
		
			
			}
			
			System.out.println( country[4]);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
	
	
	

}
