import java.util.Scanner;

public class ClassExam4 {
	
	// field -------------------------------------------------------------------
	private int num1; 
	private int num2; 
	private char oper; 
	
	// Constructor ------------------------------------------------------------
	public ClassExam4(int number1, int number2, char operation) {
		num1 = number1;
		num2 = number2;
		oper = operation;
	};
	
	// main method ------------------------------------------------------------
	public static void main(String[] args) { // method

		char cn = 'Y';
		Scanner sc = new Scanner(System.in);
		ClassExam4 calculator = new ClassExam4(0, 0, '+');

		do {
			System.out.print("1번 숫자를 입력하세요: ");
			calculator.setnum1(sc);
			System.out.print("2번 숫자를 입력하세요: ");
			calculator.setnum2(sc);
			System.out.print("사칙연산을 입력하세요: ");
			calculator.setoper(sc);
			calculator.getResult();

			System.out.print("사칙연산을 다시 하실건가요?(Y/y): ");
			cn = sc.next().charAt(0);

		} while (cn == 'Y' | cn == 'y');
	}
    // get, set method -----------------------------------------------------------------
	
	public void setnum1(Scanner sc) {
		num1 = sc.nextInt();
		System.out.println("숫자 " + num1 + "를 입력했습니다.");
	}

	public void setnum2(Scanner sc) {
		num2 = sc.nextInt();
		System.out.println("숫자 " + num2 + "를 입력했습니다.");
	}

	public void setoper(Scanner sc) {
		oper = sc.next().charAt(0);
		System.out.println("사칙연산 " + oper + "를 입력했습니다.");
	}

	public int getnum1() {
		return num1;
	}

	public int getnum2() {
		return num2;
	}

	public char getoper() {
		return oper;
	}

	public void getResult() {
		System.out.println("사칙연산 결과: " + calcul(num1, num2, oper) + "입니다.");
	}

	// 사칙연산 -----------------------------------------------------------------

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
}
