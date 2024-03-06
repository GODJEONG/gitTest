
// 20240305 신정
import java.util.Scanner;

class Hello {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		char answer = 'Y';
		do {
			System.out.println("첫번째 숫자 입력");
			int num1 = sc.nextInt();
			System.out.println("사칙연산 입력");
			String calcul2 = sc.next();
			System.out.println("두번째 숫자 입력");
			int num2 = sc.nextInt();

			if (calcul2.equals("+")) {
				System.out.println(num1 + num2);
			} else if (calcul2.equals("-")) {
				System.out.println(num1 - num2);
			} else if (calcul2.equals("*")) {
				System.out.println(num1 * num2);
			} else if (calcul2.equals("/")) {
				System.out.println((double) num1 / num2);
			} else {
				System.out.println("잘못된 입력");
			}
			System.out.println("계속 진행하시겠습니까?");
			answer = sc.next().charAt(0);

		} while (answer == 'Y' | answer == 'y');
		System.out.println("사칙연산 계산기가 종료되었습니다!");

		sc.close();
	}
}
