package day30;

public class Student {
	private String name;
	private double score;
	private String course;
	
	public Student(String name, double score, String course) {
		this.name = name;
		this.score = score;
		this.course = course;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", course=" + course + "]";
	}
}
