package variable;

class Ex06
{	//같은 클래스 내에서는 다른 메소드를 호출 가능
	public void test1() {
		System.out.println("test111");
		test2();
	}
	public void test2() {
		System.out.println("test222");
		test3();
	}
	public void test3() {
		System.out.println("test333");
	}
}

public class MainClass06 
{
	int num;
	public static void test1() {
		System.out.println("main test111");
	}
	
	public static void main(String[] args) {
		Ex06 e = new Ex06();
		e.test1();
		test1();
	}
}
