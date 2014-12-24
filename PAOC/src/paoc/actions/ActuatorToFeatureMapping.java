package paoc.actions;

public class ActuatorToFeatureMapping {
	private String actuatorType;
	private String featureType;
	
	public String getActuatorType() {
		return actuatorType;
	}

	public void setActuatorType(String actuatorType) {
		this.actuatorType = actuatorType;
	}

	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	public ActuatorToFeatureMapping(String actuatorType, String featureType){
		this.actuatorType = actuatorType;
		this.featureType = featureType;
	}
	
	

}
