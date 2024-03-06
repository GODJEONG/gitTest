
public class CallByName {
	
	public static void main(String[] args) {

		CallByName.disp2();

		CallByName cbn = new CallByName();
		cbn.disp1();

		int num = 100;
		num=cbn.disp3(num);
		System.out.println(num); // 3
		
		String str = new String("Superman");
		String c;
		c=cbn.disp4(str);
		System.out.println(c);
		System.out.println(args);
		
	}
	
	public void disp1() { // call by name
		System.out.println("call by name");
	}
	public static void disp2() { // call by name
		System.out.println("call by name");
	}
	public int disp3(int num) { // call by value / 값을 복사
		System.out.println(num); // 1
		num++;
		System.out.println(num); // 2
		
		return num;
	}
	public String disp4(String s) { // call by reference / 주소를 복사
	System.out.println(s);
	return s;
	}
}
