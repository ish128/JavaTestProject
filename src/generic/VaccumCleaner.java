package generic;

public class VaccumCleaner implements Cleaner {

	private String manufacture;
	
	public VaccumCleaner(String manufacture){
		this.manufacture = manufacture;
	}
	
	@Override
	public String getManufacture() {
		// TODO Auto-generated method stub
		return manufacture;
	}

	

}
