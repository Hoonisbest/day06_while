package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int co =0 , m =0;
		
		System.out.print("����� �����ϼ���>>>");
		co = input.nextInt();
		while(true) {
			System.out.println("=======Ŀ�� ���Ǳ�========");
			System.out.println("1.Ŀ��(200)\t\t2.���ھ�(250)\t\t3.��ȯ\t4.����");
			System.out.println("�޴��� �����ϼ���>>>");
			m = input.nextInt();
		switch(m) {
		case 1: if(co<200) {
			System.out.println("����� �����մϴ�.");
			System.exit(1);}
		else {co -=200;
			System.out.println("���ְ� �弼��");
		}break;
		case 2: if(co<250) {
			System.out.println("����� �����մϴ�.");
			System.exit(1);}
		else {co -=250;
		System.out.println("���ְ� �弼��");
		}break;
		case 3:System.out.println("�Ž����� : "+co);
				System.exit(1);
		case 4: System.out.println("���� �մϴ�.");
				System.exit(1);
		
		
		
		}
			
		}
	}
}
