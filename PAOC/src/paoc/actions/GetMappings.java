package paoc.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import paoc.helper.IFileName;

public class GetMappings {
	public synchronized static List<ProbeToFeatureMapping> getProbeToFeatureMappings(){
		List<ProbeToFeatureMapping> mappings = new ArrayList<ProbeToFeatureMapping>();
		try {
			File file = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(IFileName.PROBETOFEATUREMAPPING).toFile();
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
			FileReader in = new FileReader(file);
			BufferedReader reader = new BufferedReader(in);
			try {
				String probeType = reader.readLine();
				while(probeType != null){
					String featureType = reader.readLine();
					mappings.add(new ProbeToFeatureMapping(probeType, featureType));
					probeType = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mappings;
	}
	
	public synchronized static List<ActuatorToFeatureMapping> getActuatorToFeatureMappings(){
		List<ActuatorToFeatureMapping> mappings = new ArrayList<ActuatorToFeatureMapping>();
		try {
			File file = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(IFileName.ACTUATORTOFEATUREMAPPING).toFile();
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
			FileReader in = new FileReader(file);
			BufferedReader reader = new BufferedReader(in);
			try {
				String actuatorType = reader.readLine();
				while(actuatorType != null){
					String featureType = reader.readLine();
					mappings.add(new ActuatorToFeatureMapping(actuatorType, featureType));
					actuatorType = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mappings;
	}

}
