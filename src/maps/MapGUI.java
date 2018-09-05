package maps;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import maps.cities.Cities;
import maps.cities.City;
import maps.control.CitySelectListener;
import maps.control.SearchListener;
import maps.control.TranslateListener;
import maps.tiles.Tile;
import maps.tiles.TileUtils;

public class MapGUI {
	private Cities city;
	private JLabel tile1;
	private JLabel tile2;
	private JLabel tile3;
	private JLabel tile4;
	private JLabel tile5;
	private JLabel tile6;
	private JLabel tile7;
	private JLabel tile8;
	private JLabel tile9;
	private JComboBox<City> selCity;
	private JTextField searchBar;
	private JButton button;

	public MapGUI(Cities city) {
		super();
		this.city = city;
		this.tile1 = new JLabel();
		this.tile2 = new JLabel();
		this.tile3 = new JLabel();
		this.tile4 = new JLabel();
		this.tile5 = new JLabel();
		this.tile6 = new JLabel();
		this.tile7 = new JLabel();
		this.tile8 = new JLabel();
		this.tile9 = new JLabel();
		this.tile1.addMouseListener(new TranslateListener(this, -1, -1));
		this.tile2.addMouseListener(new TranslateListener(this, 0, -1));
		this.tile3.addMouseListener(new TranslateListener(this, 1, -1));
		this.tile4.addMouseListener(new TranslateListener(this, -1, 0));
		this.tile5.addMouseListener(new TranslateListener(this, 0, 0));
		this.tile6.addMouseListener(new TranslateListener(this, 1, 0));
		this.tile7.addMouseListener(new TranslateListener(this, -1, 1));
		this.tile8.addMouseListener(new TranslateListener(this, 0, 1));
		this.tile9.addMouseListener(new TranslateListener(this, 1, 1));
		this.selCity = new JComboBox<>();
		this.searchBar = new JTextField(20);
		this.searchBar.addKeyListener(new SearchListener(this, city));
		this.button = new JButton("select");
		this.button.addActionListener(new CitySelectListener(this));
		setReferenceTile(TileUtils.getTile(city.getDefaultCity()));
	}
	
	public Cities getCity() {
		return city;
	}

	public void setCity(Cities city) {
		this.city = city;
	}

	public JComboBox<City> getSelCity() {
		return selCity;
	}

	public void setSelCity(JComboBox<City> selCity) {
		this.selCity = selCity;
	}

	public JTextField getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(JTextField searchBar) {
		this.searchBar = searchBar;
	}

	public JPanel getSearchPanel() {
		JPanel panel = new JPanel();
		panel.add(this.searchBar);
		panel.add(this.selCity);
		panel.add(this.button);
		return panel;
	}
	public JPanel getMapPanel() {
		JPanel panel = new JPanel();
		panel.add(tile1);
		panel.add(tile2);
		panel.add(tile3);
		panel.add(tile4);
		panel.add(tile5);
		panel.add(tile6);
		panel.add(tile7);
		panel.add(tile8);
		panel.add(tile9);
		panel.setLayout(new GridLayout(3,3));
		return panel;
	}
	public void setReferenceTile(Tile t) {
		ArrayList<Tile> arr = TileUtils.getTileMap(t);
		this.tile1.setIcon(arr.get(0).getImageIcon());
		this.tile2.setIcon(arr.get(1).getImageIcon());
		this.tile3.setIcon(arr.get(2).getImageIcon());
		this.tile4.setIcon(arr.get(3).getImageIcon());
		this.tile5.setIcon(arr.get(4).getImageIcon());
		this.tile6.setIcon(arr.get(5).getImageIcon());
		this.tile7.setIcon(arr.get(6).getImageIcon());
		this.tile8.setIcon(arr.get(7).getImageIcon());
		this.tile9.setIcon(arr.get(8).getImageIcon());
	}
}
