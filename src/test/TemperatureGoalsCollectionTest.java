package test;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Lab1.DataCollection;
import Lab1.DataCollectionBuilder;
import Lab1.DataSource;
import Lab1.MatchedDataPair;
import Lab1.Resolution;
import workshop.FootballGoalsSource;
import workshop.TemperatureSource;

public class TemperatureGoalsCollectionTest {
	private DataSource footballGoals;
	private DataSource temperature;
	private DataCollectionBuilder dataCollectionBuilder;
	private DataCollection datacollection;

	@Before
	public void setUp() throws Exception {
		footballGoals = new FootballGoalsSource("Strömvallen");
		temperature = new TemperatureSource();
		footballGoals.getData();
		temperature.getData();
		dataCollectionBuilder = new DataCollectionBuilder(footballGoals, temperature, Resolution.DAY);
		datacollection = dataCollectionBuilder.getResult();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Map<String, MatchedDataPair> map = datacollection.getData();
		System.out.println(map);
		//map.get(key)
	}

}
