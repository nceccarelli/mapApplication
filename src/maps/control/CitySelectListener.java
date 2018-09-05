package maps.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import maps.MapGUI;
import maps.cities.City;
import maps.tiles.TileUtils;

public class CitySelectListener implements ActionListener{
	private MapGUI mapGUI;

	public CitySelectListener(MapGUI mapGUI) {
		super();
		this.mapGUI = mapGUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		City selection = mapGUI.getSelCity().getItemAt(mapGUI.getSelCity().getSelectedIndex());
		mapGUI.setReferenceTile(TileUtils.getTile(selection));
	}
	
}
