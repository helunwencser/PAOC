package paoc.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;

import paoc.helper.IFileName;

public class PutMappings {
	
	public synchronized static void putProbeToFeatureMappings(List<ProbeToFeatureMapping> mappings){
		try {
			File file = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(IFileName.PROBETOFEATUREMAPPING).toFile();
			if(file.exists()){
				file.delete();
				file.createNewFile();
			}	
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i < mappings.size(); i++){
				writer.write(mappings.get(i).getProbeType());
				writer.newLine();
				writer.write(mappings.get(i).getFeatureType());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized static void putActuatorToFeatureMappings(List<ActuatorToFeatureMapping> mappings){
		try {
			File file = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(IFileName.ACTUATORTOFEATUREMAPPING).toFile();
			if(file.exists()){
				file.delete();
				file.createNewFile();
			}	
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i < mappings.size(); i++){
				writer.write(mappings.get(i).getActuatorType());
				writer.newLine();
				writer.write(mappings.get(i).getFeatureType());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
