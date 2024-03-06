import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array2.graderesult(sc);
		
	}
	public static void graderesult(Scanner sc){

		System.out.print("학생수 입력: ");
		int a = sc.nextInt();

		String[] name = new String[a];
		int[][] score = new int[a][4];
		float[] avg = new float[a];

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 입력: ");
			name[i] = sc.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print("국영수 순차 입력: ");
				score[i][j] = sc.nextInt();
				score[i][score[i].length - 1] += score[i][j];
			}
			avg[i] = score[i][score[i].length - 1] / (float) (score[i].length - 1);
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름: " + name[i] + " ");
			System.out.print("국어: " + score[i][0] + " ");
			System.out.print("영어: " + score[i][1] + " ");
			System.out.print("수학: " + score[i][2] + " ");
			System.out.print("총점: " + score[i][3] + " ");
			System.out.print("평균: " + avg[i] + " ");
			System.out.println();
		}
		;
	};

}