package day06_while;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i =0, sum =0;
		while(true) {
			System.out.print("수 입력(1~100) : ");
			i = input.nextInt();
			if( i>=1 && i<=100) {
				break;
			}
			System.out.println("잘못 입력 다시");
		}
		for(int j = 1 ; j<=i; j++) {
			sum+=j;
		}
		System.out.println("입력받은 수까지의 합 :" +sum);
	
		
	 i = 0;
	 sum=0;
	while(true) {
		System.out.print("수 입력:");
		i =input.nextInt();
		if(i>=1 && i<=10) {
			break;
		}
		System.out.println("다시입력");
	}
	for(int y =1;y<=i;y++) {
		sum+=y;
	}
	System.out.println(sum);
	
	 i = 0;
	 sum=0;
	 
	 while(true) {
		 System.out.print("10~20사이의 수입력:");
		 i = input.nextInt();
		 if(i>=10 && i<=20) {
			 break;
		 }
		 System.out.println("다시 입력");
	 }
	for(int y =1;y<=i ;y++) {
		sum +=y;
	}System.out.println(sum);
	
	
	
	
	
	
	
	}
}
