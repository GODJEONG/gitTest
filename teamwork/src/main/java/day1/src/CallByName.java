import java.util.Scanner;

public class CallByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CallByName.calculator(sc);
	}

	public static void calculator(Scanner sc) {
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
	}
}
