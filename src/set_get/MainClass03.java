package set_get;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TestClass02 t = new TestClass02();
	
		String name , grade;
		int kor, eng, math,sum;
		double avg;
		
				
				System.out.print("이름 입력 : ");
				name = input.next();
				System.out.print("국어 점수 : ");
				kor = input.nextInt();
				System.out.print("영어 점수 : ");
				eng = input.nextInt();
				System.out.print("수학 점수 : ");
				math = input.nextInt();
			t.setName(name);t.setKor(kor);t.setEng(eng);
			t.setMath(math);
	
			System.out.print("이름 : "+t.getName());
			System.out.println("국어 점수 : "+kor);
			System.out.println("영어 점수 : "+eng);
			System.out.println("수학 점수 : "+math);
			System.out.println("총합 점수 : "+t.getSum());
			System.out.println("평 균 : "+t.getAvg());
			System.out.println("등 급 : "+t.getGrade());
			
		
		}
	}
		
	

