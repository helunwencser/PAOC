package paoc.actions;

import java.util.ArrayList;
import java.util.List;

import paoc.helper.INodeInitialName;

public class GetExistedTypeArray {
	public static String[] getProbeTypes(){
		List<ProbeToFeatureMapping> mappings = GetMappings.getProbeToFeatureMappings();
		String[] probeTypes = new String[mappings.size() + 1];
		probeTypes[0] = INodeInitialName.PROBE;
		for(int i = 0; i < mappings.size(); i ++)
			probeTypes[i + 1] = mappings.get(i).getProbeType();
		return probeTypes;
	}
	
	public static String[] getActuatorTypes(){
		List<ActuatorToFeatureMapping> mappings = GetMappings.getActuatorToFeatureMappings();
		String[] actuatorTypes = new String[mappings.size() + 1];
		actuatorTypes[0] = INodeInitialName.ACTUATOR;
		for(int i = 0; i < mappings.size(); i++)
			actuatorTypes[i + 1] = mappings.get(i).getActuatorType();
		return actuatorTypes;
	}
	
	public static String[] getFeatureTypes(){
		List<ProbeToFeatureMapping> probeToFeatureMappings = GetMappings.getProbeToFeatureMappings();
		List<ActuatorToFeatureMapping> actuatorToFeatureMappings = GetMappings.getActuatorToFeatureMappings();
		List<String> featureTypes = new ArrayList<String>();
		for(int i = 0; i < probeToFeatureMappings.size(); i++)
			featureTypes.add(probeToFeatureMappings.get(i).getFeatureType());
		for(int i = 0; i < actuatorToFeatureMappings.size(); i++){
			String feature = actuatorToFeatureMappings.get(i).getFeatureType();
			if(!featureTypes.contains(feature))
				featureTypes.add(feature);
		}
		String[] featureTypesArray = new String[featureTypes.size() + 1];
		featureTypesArray[0] = INodeInitialName.FEATURE;
		for(int i = 0; i < featureTypes.size(); i++)
			featureTypesArray[i + 1] = featureTypes.get(i);
		return featureTypesArray;
	}
}
