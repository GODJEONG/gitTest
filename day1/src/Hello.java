// 20240305 신정
import java.util.Scanner;

class Hello {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 0; a < 3; a++) {
			for (int b = 7; b > 3 - a; b--) {
				System.out.print(" ");
			}
			for (int c = 4; c > a * 2 + 1; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
