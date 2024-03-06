import java.util.Scanner;

public class Final {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Final.graderesult(sc); // 학생수 입력 받아 성적 관리
		Final.calculator(sc); // 사칙연산 do_while 적용
		Final.choosestar(sc); // 사칙연산 do_while 적용

	}

	public static void graderesult(Scanner sc) { // 학생수 입력 받아 성적관리(총합,평균) 결과 노출 프로그램

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

	public static void calculator(Scanner sc) { // 사칙연산 dowhile 적용
		char cn = 'Y';
		do {
			CallByName cbn = new CallByName();
			System.out.print("1번 숫자를 입력하세요: ");
			int a = cbn.input1(sc);
			System.out.print("2번 숫자를 입력하세요: ");
			int b = cbn.input1(sc);

			System.out.print("사칙연산을 입력하세요: ");
			char c = cbn.input2(sc);
			double answer = cbn.calcul(a, b, c);
			cbn.output(answer);
			System.out.print("다시 하실건가요?(Y/y): ");
			cn = sc.next().charAt(0);
		} while (cn == 'Y' | cn == 'y');
	}

	public int input1(Scanner sc) { // call by name
		int aa = sc.nextInt();
		System.out.println("숫자 " + aa + "를 입력했습니다.");
		return aa;
	}

	public char input2(Scanner sc) { // call by name
		char bb = sc.next().charAt(0);
		System.out.println("사칙연산 " + bb + "를 입력했습니다.");
		return bb;
	}

	public double calcul(int a, int b, char c) {
		double answer = 0;
		switch (c) {
		case '+':
			answer = a + b;
			break;
		case '-':
			answer = a - b;
			break;
		case '*':
			answer = a * b;
			break;
		case '/':
			answer = (double) a / b;
			break;
		}
		return answer;
	}

	public void output(double answer) {
		System.out.println("사칙연산 결과: " + answer);
	};

	public static void choosestar(Scanner sc) {
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
