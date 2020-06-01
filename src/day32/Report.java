package day32;

import java.util.HashMap;
import java.util.Map;

public class Report {
	private Map<String, Double> report = new HashMap<>();
	
	public Map<String, Double> getReport() {
		return report;
	}
	
	public void addReport(String name, Double score) {
		report.put(name, score);
	}
	
	public void veiwReport() {
		for(String key : report.keySet()) {
			System.out.println("Name: " + key +", Score: " + report.get(key));
		}
	}
	
	public static String reportToString(Map<String, Double> report) {
		String res = "-------- Report ---------\n";
		for(String key : report.keySet()) {
			res += key +" : "+ report.get(key);
		}
		res += "\n-----------------";
		
		return res;
	}
}
