package maps.tiles;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

public class Tile {
	private int x;
	private int y;
	
	public Tile(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	public String getTileURL() {
		return "http://a.tile.openstreetmap.org/6/" + this.x + "/" + this.y + ".png";
	}
	
	@Override
	public String toString() {
		return "http://a.tile.openstreetmap.org/6/" + this.x + "/" + this.y + ".png";
	}
	public ImageIcon getImageIcon() {
		 ImageIcon image = null;
	        try{
	            URL url = new URL(getTileURL());
	            image = new ImageIcon(url);
	        }catch(MalformedURLException e){
	            e.printStackTrace();
	        }
	        return image;
	}
}
