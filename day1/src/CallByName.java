import java.util.Scanner;
public class CallByName {
	public static void main(String[] args) {
		System.out.print("1번 숫자를 입력하세요: ");
		int a = CallByName.input1();
		System.out.print("2번 숫자를 입력하세요: ");
		int b = CallByName.input1();
		System.out.print("사칙연산을 입력하세요: ");
		char c = CallByName.input2();
		double answer=CallByName.calcul(a, b, c);
		CallByName.output(answer);
	}
	public static int input1() { // call by name
		Scanner sc1 = new Scanner(System.in);
		int aa = sc1.nextInt();
		System.out.println("숫자 " + aa +"를 입력했습니다.");
		return aa;
	}
	public static char input2() { // call by name
		Scanner sc2 = new Scanner(System.in);
		char bb = sc2.next().charAt(0);
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

	
