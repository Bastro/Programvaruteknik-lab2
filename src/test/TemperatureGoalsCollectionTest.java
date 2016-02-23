package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Lab1.DataCollection;
import Lab1.DataCollectionBuilder;
import Lab1.ImplDataSource;
import Lab1.Resolution;

public class TemperatureGoalsCollectionTest {
	private Map<LocalDate, Double> temperaturDataMap;
	private Map<LocalDate, Double> goalDataMap;
	private ImplDataSource dataX;
	private ImplDataSource dataY;
	private DataCollectionBuilder dataCollectionBuilder;

	@Before
	public void setUp() throws Exception {
		temperaturDataMap = new HashMap<LocalDate, Double>();
		goalDataMap = new HashMap<LocalDate, Double>();
		dataX = new ImplDataSource("Temerature", "C");
		dataY = new ImplDataSource("Goal", "z+");
		insertData();
		dataCollectionBuilder = new DataCollectionBuilder(dataX, dataY, Resolution.DAY);
	}

	@After
	public void tearDown() throws Exception {
	}

	private void insertData() {
		for (LocalDate temperaturKey : temperaturDataMap.keySet()) {
			dataX.addData(temperaturKey, temperaturDataMap.get(temperaturKey));

		}
		for (LocalDate goalKey : goalDataMap.keySet()) {
			dataY.addData(goalKey, goalDataMap.get(goalKey));
		}
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
