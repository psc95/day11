package variable;
class Common{
	static final String PATH = "c://test폴더/";
	// final이 있으면 변경하지못함
}
class AAA{
	public void test() {
		Common c = new Common();
		System.out.println(c.PATH+"AAA접근하여 작업합니다");
		//c.PATH = "경로를 변경합니다";
	}
}
class BBB{
	public void test() {
		//객체를 만들어서 값을 불러오는것보다 static을 통해 하는게 더 편리
		// static을 써서 클래스이름 으로 접근 가능
		System.out.println(Common.PATH+"BBB접근하여 작업합니다");
	}
}

public class MainClass08 {
public static void main(String[] args) {
	AAA a = new AAA();
	BBB b = new BBB();
	a.test(); b.test();
}
}
