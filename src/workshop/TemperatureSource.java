package workshop;

import java.time.LocalDate;
import java.util.Map;

import Lab1.DataSource;

public class TemperatureSource implements DataSource {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Temperatur for Gävle";
	}

	@Override
	public String getUnit() {
		// TODO Auto-generated method stub
		return "C";
	}

	@Override
	public Map<LocalDate, Double> getData() {
		 UrlFetcher csvFetcher = new UrlFetcher("http://opendata-download-metobs.smhi.se/explore/zip?parameterIds=2&stationId=107420&period=corrected-archive&includeMetadata=false");
		 CsvToMapParser parsed = new CsvToMapParser(csvFetcher.getContent());
		Map<LocalDate,Double> data = parsed.getResult( );

		
		return data;
	}
	
	
	

}
