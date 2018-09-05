package maps.cities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Cities {
	private String filename;
	private ArrayList<City> arr;

	public Cities(String filename) {
		super();
		this.filename = filename;
		this.arr = parseCities();
	}
	
	public ArrayList<City> parseCities(){
		ArrayList<City> arr = new ArrayList<>();
		try{
	        for(String line : Files.readAllLines(Paths.get(this.filename))){
	            String[] data = line.split(",");
	            String country = data[0];
	            String name = data[1];
	            String region = data[2];
	            int pop = Integer.parseInt(data[3]);
	            double lat = Double.parseDouble(data[4]);
	            double longe = Double.parseDouble(data[5]);
	            City cit = new City(pop, name, region, country, lat, longe);
	            arr.add(cit);
	        }
	    } catch (IOException ex){
	        ex.printStackTrace();
	    }
		return arr;
	}
	public City getDefaultCity() {
		return new City(279557, "buffalo", "NY", "us", 42.8863889, -78.8786111);
	}
	public ArrayList<City> searchByName(String in){
		ArrayList<City> nArr = new ArrayList<>();
		for(City c : this.arr) {
			if (c.getName().contains(in)) {
				nArr.add(c);
			}
		}
		Collections.sort(nArr, new CityComparator());
		return nArr;
	}
	

}
