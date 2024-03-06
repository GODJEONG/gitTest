import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {

		String name;
		int score[] = new int[4];
		float avg;

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("국영수 순차 입력: ");
		for (int i = 0; i < 3; i++) {
			score[i] = sc.nextInt();
			score[score.length - 1] += score[i];
		}
		;
		avg = (float)score[3] / (score.length - 1);
		System.out.print("이름: " + name + " ");
		System.out.print("국어: " + score[0] + " ");
		System.out.print("영어: " + score[1] + " ");
		System.out.print("수학: " + score[2] + " ");
		System.out.print("총점: " + score[3] + " ");
		System.out.print("평균: " + avg + " ");

//		int[] arr = new int[50];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=i;
//			System.out.println(arr[i]);
//		}
//		for(int i:arr) {
//			arr[i]=i;
//			System.out.println(i);
//		}

	}
}
