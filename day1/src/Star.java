import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("보고싶은 별모양 번호를 입력하세요: ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			one();
			break;
		case 2:
			two();
			break;
		case 3:
			tree();
			break;
		case 4:
			four();
			break;
		case 5:
			five();
			break;
		case 6:
			six(sc);
			break;
		}
		;
	}
	public static void one() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void two() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void tree() {
		for (int i = 1; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void four() {
		for (int i = 1; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void five() {
		for (int i = 1; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 2; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void six(Scanner sc) {
		System.out.print("홀수를 입력하세요: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i < (num / 2) + 1) { // 위쪽 삼각형
					if (i + j < (num / 2)) { // 위쪽 왼쪽 빈칸
						System.out.print(" ");
					} else if (j - i >= (num / 2) + 1) { // 위쪽 오른쪽 빈칸
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > (num / 2)) { // 아래쪽 삼각형
					if (i - j >= num / 2 + 1) { // 아래쪽 왼쪽 빈칸
						System.out.print(" ");
					} else if (j + i >= (num / 2) * 3 + 1) { // 아래쪽 오른쪽 빈칸
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

	}
}
