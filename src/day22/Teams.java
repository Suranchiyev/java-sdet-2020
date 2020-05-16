package day22;

public class Teams {
	public static void main(String[] args) {
		//                               0                                           1                       
		String[][] teams = {{"Yulduz", "Mark", "Akylbek", "Daniel"}, {"Ariunna", "Frank", "Nurgazy", "Anna"}, {"Selvin", "Meerim"}, {}};
		//                     0         1        2           3         0          1         2          3
		String name = teams[1][1].toUpperCase();
		System.out.println(name);
		
		System.out.println(teams[2][1]);
		
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		
		System.out.println(teams[2].length);
		
		System.out.println("----------------");
		
		for(int i = 0; i < teams.length; i++) {
			for(int j = 0; j < teams[i].length; j++) {
				System.out.println(teams[i][j]);
			}
		}
	}
}
