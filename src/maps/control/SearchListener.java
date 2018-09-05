package maps.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import maps.MapGUI;
import maps.cities.Cities;
import maps.cities.City;

public class SearchListener implements KeyListener{
	private MapGUI mapGUI;
	private Cities cities;
	public SearchListener(MapGUI mapGUI, Cities cities) {
		super();
		this.mapGUI = mapGUI;
		this.cities = cities;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		mapGUI.getSelCity().removeAllItems();
		ArrayList<City> search = this.cities.searchByName(this.mapGUI.getSearchBar().getText());
		for (City c : search) {
			mapGUI.getSelCity().addItem(c);
		}
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
