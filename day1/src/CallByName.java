import java.util.Scanner;

public class CallByName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("1번 숫자를 입력하세요: ");
		int a = CallByName.input1(sc);
		System.out.print("2번 숫자를 입력하세요: ");
		int b = CallByName.input1(sc);
		System.out.print("사칙연산을 입력하세요: ");
		char c = CallByName.input2(sc);
		double answer=CallByName.calcul(a, b, c);
		CallByName.output(answer);

	}
	public static int input1(Scanner sc) { // call by name

		int aa = sc.nextInt();
		System.out.println("숫자 " + aa +"를 입력했습니다.");
		return aa;
	}
	public static char input2(Scanner sc) { // call by name
		char bb = sc.next().charAt(0);
		System.out.println("사칙연산 " + bb +"를 입력했습니다.");
		return bb;
	}	
	public static double calcul(int a, int b, char c) { 
		double answer=0;
		switch(c) {
		case '+': answer = a+b; break;
		case '-': answer = a-b; break;
		case '*': answer = a*b; break;
		case '/': answer = (double)a/b; break;
		}
		return answer;
	}
	public static void output(double answer) {
		System.out.println("사칙연산 결과: " + answer);
	}	
}

	

