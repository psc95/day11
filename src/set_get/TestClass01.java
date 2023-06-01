package set_get;

public class TestClass01 {
	private String name, addr;
	private int age;
	
	public void setAge(int a) {
		age = a;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAddr(String ad) {
		addr = ad;
		//this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
}
