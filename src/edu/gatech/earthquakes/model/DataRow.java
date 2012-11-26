package edu.gatech.earthquakes.model;

import java.util.Map;

public class DataRow {
    public final static String DATE = "Date";
    public final static String RECORD = "Record";
    public final static String LATTITUDE = "Lattitude";
    public final static String LONGITUDE = "Longitude";
    public final static String TIME = "Time";
    public final static String CONTINENT = "Continent";
    public enum Continent {
        AFRICA,
        AUSTRALIA,
        CHINA,
        EURASIA,
        INDIA,
        NORTH_AMERICA,
        SOUTH_AMERICA,
    }
    public final static String DEPTH = "Depth";
    public final static String MOMENT_MAGNITUDE = "Magnitude";
    public final static String MOMENT_MAGNITUDE_UNCERTAINTY = "Magnitude_Uncertainty";
    public final static String BODY_WAVE_MAGNITUDE = "Body Wave Magnitude";
    public final static String SURFACE_WAVE_MAGNITUDE = "Surface Wave Magnitude";
    public final static String LOCAL_WAVE_MAGNITUDE = "Local Wave Magnitude";
    public final static String DEPENDENCY = "Dependency";
    public final static String MAIN_DATE = "Main Date";
    public enum Dependency{
        INDEPENDENT,
        DEPENDENT,
        POSSIBLY,
    }
    public final static String TYPE = "Type";
    public enum Type{
        TECT,
        DEEP_MINING,
        MINING,
        RESERVOIR,
        OIL_FEILD,
    }

    private Map<String, Object> variables;

	public DataRow(Map<String, Object> variables){
		this.variables = variables;
	}

	public Map<String, Object> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}
	
	public Object getValue(String dataType){
		return variables.get(dataType);
	}

}
