package workshop;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Lab1.DataCollection;
import Lab1.DataCollectionBuilder;
import Lab1.ImplDataSource;
import Lab1.Resolution;

public class Main {
	private static DataCollectionBuilder dcb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<LocalDate, Double> temperaturDataMap = new HashMap<LocalDate, Double>();
		Map<LocalDate, Double> goalDataMap = new HashMap<LocalDate, Double>();
		TemperatureSource test = new TemperatureSource();
		FootballGoalsSource goal = new FootballGoalsSource();
		ImplDataSource dataX = new ImplDataSource("Temerature", "C");
		ImplDataSource dataY = new ImplDataSource("Goal", "z+");
		dcb = new DataCollectionBuilder(dataX, dataY, Resolution.DAY);
		DataCollection dc;
		
		
		temperaturDataMap = test.getValues();
		goalDataMap = goal.getValues();
		
		for(LocalDate temperaturKey : temperaturDataMap.keySet())
		{ 
			dataX.addData(temperaturKey, temperaturDataMap.get(temperaturKey));
		
		}
		for(LocalDate goalKey : goalDataMap.keySet())
		{ 
			dataY.addData(goalKey, goalDataMap.get(goalKey));
		}
		
		
		dc = dcb.getResult();
		
		System.out.println("a  "+dc.getData().toString());
		
	}

}
