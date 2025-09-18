package basiclevel;

	class LegacyAPI {
	    @Deprecated
	    public void oldFeature() {
	        System.out.println("Old feature (deprecated)");
	    }

	    public void newFeature() {
	        System.out.println("New feature (use this instead)");
	    }
	}
	public class UseDeprecated {
	    public static void main(String[] args) {
	        LegacyAPI api = new LegacyAPI();
	        api.oldFeature(); // shows warning
	        api.newFeature();
	    }
	}
