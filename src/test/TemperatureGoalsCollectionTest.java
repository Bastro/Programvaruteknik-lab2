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
import workshop.FootballGoalsSource;
import workshop.TemperatureSource;

public class TemperatureGoalsCollectionTest {
	private Map<LocalDate, Double> temperaturDataMap;
	private Map<LocalDate, Double> goalDataMap;
	private DataSource footballGoals;
	private DataSource temperature;
	private DataCollectionBuilder dataCollectionBuilder;

	@Before
	public void setUp() throws Exception {
		footballGoals = new FootballGoalsSource("Strömvallen");
		temperature = new TemperatureSource();
		insertData();
		dataCollectionBuilder = new DataCollectionBuilder(footballGoals, temperature, Resolution.DAY);
	}

	@After
	public void tearDown() throws Exception {
	}

	private void insertData() {
		goalDataMap = footballGoals.getValues();
		temperaturDataMap = temperature.getValues();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
