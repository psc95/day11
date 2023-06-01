package set_get;

public class TestClass02 {
	private String name, grade;
	private int kor, eng, math, sum;
	private double avg;

	public void setName(String n) {
		name = n;
	}

	public void setGrade(String g) {
		grade = g;
	}

	public void setKor(int k) {
		kor = k;
	}

	public void setEng(int e) {
		eng = e;
	}

	public void setMath(int m) {math = m;}

	public void setSum(int s) {sum = s;}

	public void setAvg(double a) {
		avg = a;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		switch((int)avg/10) {
		case 10:
		case 9:
			grade ="A";
			break;
		case 8:
			grade ="B";
			break;
		default : 
			grade ="C";
			break;
		}
		return grade;
		
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		sum =kor+eng+math;
		return sum;
	}

	public double getAvg() {
		avg=sum/3.0f;
		return avg;
	}
	
	

	/*
	 * TestClass02에서 하는 역할은 set,getter과 연산을 담당하는 역할을 한다 기본 입출력은 main에서 만든 입력, 연산, 출력
	 * 기능을 만들어 주세요 입력 : 이름, 국, 영, 수 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능 출력 : 이름,
	 * 국, 영, 수, 합, 평균, 등급 등급 : 평균이 90이상 A, 80이상 B 나머진 C
	 */

}
