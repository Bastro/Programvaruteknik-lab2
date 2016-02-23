package workshop;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Lab1.ImplDataSource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<LocalDate, Double> temperaturDataMap = new HashMap<LocalDate, Double>();
		Map<LocalDate, Double> goalDataMap = new HashMap<LocalDate, Double>();
		TemperatureSource test = new TemperatureSource();
		FootballGoalsSource goal = new FootballGoalsSource();
		ImplDataSource dataX = new ImplDataSource("Temerature", "C");
		ImplDataSource dataY = new ImplDataSource("Goal", "z+");
		
		temperaturDataMap = test.getValues();
		goalData
		
		for(LocalDate temperaturKey : temperaturDataMap.keySet())
		{ 
			dataX.addData(temperaturKey, dataX.getData().get(temperaturKey));
		
		}
		for(LocalDate goalKey : temperaturDataMap.keySet())
		{ 
			dataX.addData(goalKey, dataX.getData().get(goalKey));
		
		}
		
		
	
		
	}

}
