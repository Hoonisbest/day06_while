package day06_while;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i =0, sum =0;
		while(true) {
			System.out.print("�� �Է�(1~100) : ");
			i = input.nextInt();
			if( i>=1 && i<=100) {
				break;
			}
			System.out.println("�߸� �Է� �ٽ�");
		}
		for(int j = 1 ; j<=i; j++) {
			sum+=j;
		}
		System.out.println("�Է¹��� �������� �� :" +sum);
	
		
	 i = 0;
	 sum=0;
	while(true) {
		System.out.print("�� �Է�:");
		i =input.nextInt();
		if(i>=1 && i<=10) {
			break;
		}
		System.out.println("�ٽ��Է�");
	}
	for(int y =1;y<=i;y++) {
		sum+=y;
	}
	System.out.println(sum);
	
	 i = 0;
	 sum=0;
	 
	 while(true) {
		 System.out.print("10~20������ ���Է�:");
		 i = input.nextInt();
		 if(i>=10 && i<=20) {
			 break;
		 }
		 System.out.println("�ٽ� �Է�");
	 }
	for(int y =1;y<=i ;y++) {
		sum +=y;
	}System.out.println(sum);
	
	
	
	
	
	
	
	}
}
