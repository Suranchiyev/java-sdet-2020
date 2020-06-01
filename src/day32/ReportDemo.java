package day32;

import java.util.Map;

public class ReportDemo {
	public static void main(String[] args) {
		Report javaCourse = new Report();
		javaCourse.addReport("John Doe", 98.9);
		javaCourse.addReport("Smith", 72.0);
		javaCourse.veiwReport();
		
		Map<String, Double> javaRep = javaCourse.getReport();
		
		String javaRepStr = Report.reportToString(javaRep);
		
		System.out.println(javaRepStr);
		
		// ----
		System.out.println("\n");
		
		Report seleniumCourse = new Report();
		seleniumCourse.addReport("Alex", 50.0);
		seleniumCourse.addReport("Viktor", 90.0);
		seleniumCourse.veiwReport();
		Map<String, Double> selenium = javaCourse.getReport();
		
		String seleniumRep = Report.reportToString(selenium);
		System.out.println(seleniumRep);
	}
}
