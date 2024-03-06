// 20240305 신정

import java.util.Scanner;

class Hello {
	public static void main(String args[]) {
		Scanner sc;
		sc = new Scanner(System.in);
		int num = sc.nextInt();

		int space = num / 2;
		int star = 1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별 출력
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();

			// 다음 행으로 이동할 때마다 공백과 별 개수 조절
			if (i < num / 2) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
		}
	}
}
