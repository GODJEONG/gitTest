
public class ClassExam6 {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public ClassExam6 GetObject(){
		return this;
	};
	
	public static void main(String[] args) {
		ClassExam6 th = new ClassExam6();

		th.setA(100);
		ClassExam6 th2 = th.GetObject();
		System.out.println(th.getA());
		System.out.println(th);
		System.out.println(th2);
	}
	
}
