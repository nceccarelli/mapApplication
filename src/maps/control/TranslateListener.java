package maps.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import maps.MapGUI;
import maps.cities.City;
import maps.tiles.Tile;

public class TranslateListener implements MouseListener{
	private MapGUI mapGUI;
	private int x;
	private int y;
	public TranslateListener(MapGUI mapGUI, int x, int y) {
		super();
		this.mapGUI = mapGUI;
		this.x = x;
		this.y = y;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		City c = null;
		if (mapGUI.getSelCity().getItemAt(mapGUI.getSelCity().getSelectedIndex())==null) {
			c = mapGUI.getCity().getDefaultCity();
		} else {
			c = mapGUI.getSelCity().getItemAt(mapGUI.getSelCity().getSelectedIndex());
		}
		double lon = c.getLongitude();
		double lat = c.getLatitude();
		int xn = (int)Math.floor( (lon + 180) / 360 * (1<<6) ) + this.x;
		int yn = (int)Math.floor( (1 - Math.log(Math.tan(Math.toRadians(lat)) + 1 / Math.cos(Math.toRadians(lat))) / Math.PI) / 2 * (1<<6) ) + this.y;
		Tile t = new Tile(xn,yn);
		mapGUI.setReferenceTile(t);
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
