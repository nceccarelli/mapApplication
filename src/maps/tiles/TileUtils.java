package maps.tiles;

import java.util.ArrayList;

import maps.cities.City;

public class TileUtils {
	public static Tile getTile(City c) {
		double lon = c.getLongitude();
		double lat = c.getLatitude();
		int x = (int)Math.floor( (lon + 180) / 360 * (1<<6) ) ;
		int y = (int)Math.floor( (1 - Math.log(Math.tan(Math.toRadians(lat)) + 1 / Math.cos(Math.toRadians(lat))) / Math.PI) / 2 * (1<<6) ) ;
		Tile t = new Tile(x,y);
		return t;
	}
	public static ArrayList<Tile> getTileMap(Tile t){
		ArrayList<Tile> arr = new ArrayList<>();
		int x = t.getX();
		int y = t.getY();
		arr.add(new Tile(x - 1, y - 1));
		arr.add(new Tile(x, y - 1));
		arr.add(new Tile(x + 1, y - 1));
		arr.add(new Tile(x - 1, y));
		arr.add(new Tile(x, y));
		arr.add(new Tile(x + 1, y));
		arr.add(new Tile(x - 1, y + 1));
		arr.add(new Tile(x, y + 1));
		arr.add(new Tile (x + 1, y + 1));
		return arr;
	}
}
