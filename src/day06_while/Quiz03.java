package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int co =0 , m =0;
		
		System.out.print("요금을 투입하세요>>>");
		co = input.nextInt();
		while(true) {
			System.out.println("=======커피 자판기========");
			System.out.println("1.커피(200)\t\t2.코코아(250)\t\t3.반환\t4.종료");
			System.out.println("메뉴를 선택하세요>>>");
			m = input.nextInt();
		switch(m) {
		case 1: if(co<200) {
			System.out.println("요금이 부족합니다.");
			System.exit(1);}
		else {co -=200;
			System.out.println("맛있게 드세요");
		}break;
		case 2: if(co<250) {
			System.out.println("요금이 부족합니다.");
			System.exit(1);}
		else {co -=250;
		System.out.println("맛있게 드세요");
		}break;
		case 3:System.out.println("거스름돈 : "+co);
				System.exit(1);
		case 4: System.out.println("종료 합니다.");
				System.exit(1);
		
		
		
		}
			
		}
	}
}
