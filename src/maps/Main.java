package maps;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import maps.cities.Cities;

public class Main {
	public static void startGUI() {
		
		JFrame frame = new JFrame("Maps");
		Cities city = new Cities("cities.csv");
		MapGUI instance = new MapGUI(city);
		
		frame.getContentPane().add(instance.getSearchPanel(), BorderLayout.NORTH);
		frame.getContentPane().add(instance.getMapPanel(), BorderLayout.CENTER);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
		public static void main(String [] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					startGUI();
				}
			});

		}
		}
