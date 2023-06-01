package this_;

class Ex02{
	int num = 111;
	public void test() {
		int num = 100;
		System.out.println("test : " + num );
		System.out.println("test.this : " + this.num );
		// 동일한 num이 있을때 자기랑 가까운 num이 출력되는데
		// this를 사용하면 메서드 밖에 num에 접근을 할 수 있다.
		test2();
	}
	public void test2() {
		System.out.println("test2 : "+num );
	}
}

public class MainClass02 {
public static void main(String[] args) {
	Ex02 e = new Ex02();
	e.test();
}
}
