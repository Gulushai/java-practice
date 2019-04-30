package day28_Arrays;

import java.util.Arrays;

public class FootballTeam {

	public static void main(String[] args) {
		String[][] teams = new String[2][6];
		teams[0][0] ="Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] ="Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitry";
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);
		System.out.println(Arrays.deepToString(teams));
		System.out.println("Numbers of row: "+ teams.length);
		System.out.println("Numbers of people Team 1: " + teams[0].length);
		System.out.println("Numbers of people Team 2: " + teams[1].length);
		
		int[][] nums= new int[3][4]; 
		nums[0][0] = 100;
		nums[0][1] = 111;
		nums[0][2] = 122;
		nums[0][3] = 133;
		
		nums[1][0] = 144;
		nums[1][1] = 155;
		nums[1][2] = 166;
		nums[1][3] = 177;
		
		nums[2][0] = 188;
		nums[2][1] = 199;
		nums[2][2] = 200;
		nums[2][3] = 210;
		
		System.out.println(Arrays.deepToString(nums));
		
		int[][] scores = {{3,5,6}, {2,6,4,10}};
		System.out.println("Days played/Number of Arrays: "+scores.length);
		System.out.println("Number of values in 1: "+ scores[0].length);
		System.out.println("Number of values in 2: "+ scores[1].length);
		

	}

}
