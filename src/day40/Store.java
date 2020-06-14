package day40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Store {
	public static final String ITEMS_FILE_PATH = "src/day40/Items";
	
	private static Map<String, Double> items = new HashMap<>();
	
	static {
		File itemsFile = new File(ITEMS_FILE_PATH);
		try(BufferedReader r = new BufferedReader(new FileReader(itemsFile))) {		
			String line;
			while((line = r.readLine()) != null ) {
				
				String[] parts = line.split("="); // [key][value]
				String key = parts[0].trim();
				Double value = Double.parseDouble(parts[1].trim());
				
				items.put(key, value);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Map<String, Double> getItems() {
		return items;
	}
	
	public Double lookPrice(String itemName) {
		return items.get(itemName);
	}
	
	public void addItem(String name, Double price) {
		items.put(name, price);
		writeToFile(items);
	}
	
	private void writeToFile(Map<String, Double> content) {
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(ITEMS_FILE_PATH))) {
			
			for(String key : content.keySet()) {
				String line = key + "=" + content.get(key);
				writer.write(line);
				writer.newLine();
			}
			// Break 10 min till 2:14pm EST
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	 
}
