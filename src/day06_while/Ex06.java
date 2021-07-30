package day06_while;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1=null , n2= null;
		System.out.print("첫 문자 입력 : ");
		n1 = input.next();
		System.out.print("두번째 문자 입력 : ");
		n2 = input.next();
		System.out.println("n1의 길이 :"+n1.length());
		System.out.println("n2의 길이 :"+n2.length());
		System.out.println("n1== n2 :"+(n1 == n2));
		System.out.println("n1.equals(n2) :"+n1.equals(n2));
		System.out.println("n2.equals(n1) :"+n2.equals(n1));
	}
}
