package maps.cities;
import java.util.Comparator;

public class CityComparator implements Comparator<City>{
	@Override
    public int compare(City in1, City in2) {
        if(in1.getPop()==(in2.getPop())) {
            return 0;
        }else if(in1.getPop() > in2.getPop()) {
            return -1;
        } else {
            return 1;
        }
    }
}
