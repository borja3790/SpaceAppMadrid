package es.tony.dataProcesing;


public class Calculus {
	public final static double AVERAGE_ENERGY_COST = 0.19; // $/kWh
	
	
	
	// installation_type;
	//   0 - EXPENSIVE
	//   1 - MEDIUM
	//   2 - CHEAP
	
	
	
	/*
	 * We calculate the total energy generated by an array of solar
	 * panels; however, these panels will saturate at some point (given by
	 * the parameter ‘max_power_solar’).
	 * 
	 */
	public static double energyGeneratedSolar(double surface_solar, double radiation_solar,
			int installation_type) 
	{
		double energy_generated_solar;	// kWh per day
		
		double efficiency = 0.0;
		double max_power_solar = 0.0; 	// maximum power generated by the solar panel (W/m2). 
										// It is turned into energy by multiplying power by time (1hour).
		double max_energy_solar;
		
		switch (installation_type) {
			case 0: 
				efficiency = 0.225;
				max_power_solar = 217;
				break;
			
			case 1: 
				efficiency = 0.193;
			    max_power_solar = 210;
				break;
			
			case 2: 
				efficiency = 0.159;
				max_power_solar = 152.5;
				break;
		}
		
		energy_generated_solar = surface_solar * radiation_solar * efficiency;
		max_energy_solar = surface_solar * max_power_solar; // * 1h
		
		if (energy_generated_solar > max_energy_solar) {
			energy_generated_solar = max_energy_solar;
		}
		
		return energy_generated_solar;
	}
	
	
	/*
	 * We calculate the total energy generated by a number of windmills
	 * placed in the facility.
	 *   v is windspeed in m/s
	 *   
	 */
	public static double energyGeneratedWind(double v, int number_windmills, 
			int installation_type)
	{
		double energy_generated_wind;	// kWh per day
		
		double max_power_wind = 0.0;	// maximum power generated by the wind turbine
		
		energy_generated_wind = (-0.0027*v*v*v+0.0614*v*v-0.2985*v+0.45); // unitary energy
		
		switch (installation_type) {
			case 0: 
				energy_generated_wind = 3000*energy_generated_wind*24*number_windmills*0.5;
				max_power_wind = 3000;
				break;
			
			case 1: 
				energy_generated_wind = 1500*energy_generated_wind*24*number_windmills*0.5;
				max_power_wind = 1500;
				break;
			
			case 2: 
				energy_generated_wind = 650*energy_generated_wind*24*number_windmills*0.5;
				max_power_wind = 650;
				break;
		}
		
		if(v > 12.5) {
			energy_generated_wind = max_power_wind*24;
		}
		if (v < 3.5 || v > 26) {
			energy_generated_wind = 0;
		}
		
		return energy_generated_wind;
	}
	
	
	/*
	 * In this case, we try to calculate the number of homes we can feed
	 * with the energy generated by renewal sources in the area (so we do
	 * not generate poisonous gases).
	 * 
	 */
	public static double homeEquivalent(double energy_generated) 
	{
		double average_home_energy = 27.4; // % kWh/day
		return energy_generated / average_home_energy;
	}
	
	
	/*
	 * This parameter is intended to give the monetary value that is
	 * generated by renewal sources in the area. That is to say, the
	 * expected monetary value a potential customer will pay for the
	 * energy generated by sun or wind.
	 * 
	 */
	public static double monetaryEquivalent(double energy_generated) 
	{
		return energy_generated * AVERAGE_ENERGY_COST; //0.19 $/kWh
	}
	
	
	/* This parameter is intended to provide the cost of the facilities
	 * installation. This is the cost of deployment of the solar panels.
	 * 
	 */
	public static double facilitySolarCost(double surface, int installation_type) 
	{
		double facility_solar_cost;

		double installation_cost;
		double price_solar_m2 = 0.0;
		
		switch (installation_type) {
			case 0:  
				price_solar_m2 = 600;
				break;			
			case 1: 
				price_solar_m2 = 460;
				break;
			case 2: 
				price_solar_m2 = 111;
				break;
		}
		installation_cost = 666.67;
		
		facility_solar_cost = price_solar_m2 * surface + installation_cost * surface;
		
		return facility_solar_cost;
	}
	
	
	/* This parameter is intended to provide the cost of the facilities
	 * installation. This is the cost of deployment of the wind towers.
	 * 
	 */
	public static double facilityWindCost(int number_windmills, int installation_type) 
	{
		double facility_wind_cost;
		
		double installation_cost = 0.0;
		
		switch (installation_type) {
			case 0:  
				installation_cost = 3300000;
				break;			
			case 1: 
				installation_cost = 1500000;
				break;
			case 2: 
				installation_cost = 460000;
				break;
		}
		
		facility_wind_cost = installation_cost * number_windmills;
		
		return facility_wind_cost;
	}
	
	
	/*
	 * This parameter is intended to provide how many days are needed
	 * to make profitable the installations. It is the period needed to
	 * generate the energy that equals the facility cost.
	 *  
	 */
	public static int timeToRecoverTheInversion(double facility_cost, double monetary_equivalent)
	{
		return (int)(facility_cost / monetary_equivalent / 365.0);
	}
}
