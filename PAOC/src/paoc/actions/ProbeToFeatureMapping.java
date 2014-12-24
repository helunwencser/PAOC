package paoc.actions;
public class ProbeToFeatureMapping{
		private String probeType;
		private String featureType;
		
		public ProbeToFeatureMapping(String probeType, String featureType){
			this.probeType = probeType;
			this.featureType = featureType;
		}
		
		public String getProbeType() {
			return probeType;
		}
		public void setProbeType(String probeType) {
			this.probeType = probeType;
		}
		public String getFeatureType() {
			return featureType;
		}
		public void setFeatureType(String featureType) {
			this.featureType = featureType;
		}
	}