package this_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Ex03 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	public void in() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("국어 점수 : ");
		kor = input.nextInt();
		System.out.print("영어 점수 : ");
		eng = input.nextInt();
		System.out.print("수학 점수 : ");
		math = input.nextInt();
		
	}
	public void op() {
		sum = (kor + eng + math);
		avg = (kor + eng + math) / 3;
		if (avg >= 90) {
			grade = "A";
			
		}else if(avg >=80 && avg < 90) {
			grade = "B";
			
		}else {
			grade = "C";
			
		}
	}
	public void pr() {
		System.out.print("이름 : "+name);
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("총합 점수 : "+sum);
		System.out.println("평 균 : "+avg);
		System.out.println("등 급 : "+grade);
	}
}

public class TestClass02 {
	public static void main(String[] args) {

		Ex03 e = new Ex03();
		e.in();
		e.op();
		e.pr();
		
	}
}
