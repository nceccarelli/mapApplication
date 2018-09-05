package maps.cities;

public class City {
	private int pop;
	private String name;
	private String region;
	private String country;
	private double latitude;
	private double longitude;
	
	
	public City(int pop, String name, String region, String country, double latitude, double longitude) {
		super();
		this.pop = pop;
		this.name = name;
		this.region = region;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return this.pop + " - " + this.name + ", " + this.region + ", " + this.country;
	}
}
