
public class StringExam {

	public static void main(String[] args) {
		String str1 = new String("one");
		String str2 = new String("one");

		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) {
			System.out.println("Same");
		} else {
			System.out.println("diff");

		}
		if (str1.equals(str2)) {
			System.out.println("Same");
		} else {
			System.out.println("diff");
		}
		
		str2 = new String("ones");

		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) {
			System.out.println("Same");
		} else {
			System.out.println("diff");

		}
		if (str1.equals(str2)) {
			System.out.println("Same");
		} else {
			System.out.println("diff");
		}

		String str3 = "two";
		String str4 = "two";

		System.out.println(str3);
		System.out.println(str4);

		if (str3 == str4) {
			System.out.println("Same");
		} else {
			System.out.println("diff");

		}
		if (str3.equals(str4)) {
			System.out.println("Same");
		} else {
			System.out.println("diff");
		}
		
		str4="pororo";
		if (str3 == str4) {
			System.out.println("Same");
		} else {
			System.out.println("diff");

		}
		if (str3.equals(str4)) {
			System.out.println("Same");
		} else {
			System.out.println("diff");
		}

		
	}
}
