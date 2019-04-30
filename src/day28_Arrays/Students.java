package day28_Arrays;

public class Students {

	public static void main(String[] args) {
		int[][] students = {{4,5,6}, {12,11,22}, {44,32,12,41,65}};
		for (int[] group : students) {
			for(int studentsId : group) {
				System.out.print(studentsId + ", ");
			}
			System.out.println();
		}
		
		for(int i =0; i<=students.length; i++) {
			for(int j=0; j<students[i].length; j++) {
				System.out.print(students[i][j]+ " ");
			}System.out.println();
		}
	}

}
