import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		String[] name = new String[3];
		int[][] score = new int[3][4];
		float[] avg = new float[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 입력: ");
			name[i] = sc.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.print("국영수 순차 입력: ");
				score[i][j] = sc.nextInt();
				score[i][score[i].length - 1] += score[i][j];
			}
			avg[i] = score[i][score[i].length - 1] / (float) (score[i].length - 1);	
		}
		for(int i=0;i<name.length;i++) {
		System.out.print("이름: " + name[i] + " ");
		System.out.print("국어: " + score[i][0] + " ");
		System.out.print("영어: " + score[i][1] + " ");
		System.out.print("수학: " + score[i][2] + " ");
		System.out.print("총점: " + score[i][3] + " ");
		System.out.print("평균: " + avg[i] + " ");
		System.out.println();
		};
	};

}