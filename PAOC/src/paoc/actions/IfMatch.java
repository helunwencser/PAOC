package paoc.actions;

import java.util.List;

import paoc.helper.INodeInitialName;

public class IfMatch {
	public static boolean isIfProbeMathesFeature(String probeType, String featureType){
		if(!probeType.equals(INodeInitialName.PROBE) 
				&& !featureType.equals(INodeInitialName.FEATURE)){
			List<ProbeToFeatureMapping> mappings = GetMappings.getProbeToFeatureMappings();
			for(int i = 0; i < mappings.size(); i++){
				if(mappings.get(i).getProbeType().equals(probeType)
						&&
						mappings.get(i).getFeatureType().equals(featureType))
					return true;
			}
			return false;
		}
		else
			return true;
	}

	public static boolean isIfActuatorMatchesFeature(String actuatorType, String featureType){
		if(!actuatorType.equals(INodeInitialName.ACTUATOR)
				&& !featureType.equals(INodeInitialName.FEATURE)){
			List<ActuatorToFeatureMapping> mappings = GetMappings.getActuatorToFeatureMappings();
			for(int i = 0; i < mappings.size(); i++){
				if(mappings.get(i).getActuatorType().equals(actuatorType)
						&&
						mappings.get(i).getFeatureType().equals(featureType))
					return true;
			}
			return false;
		}
		return true;
	}
}
