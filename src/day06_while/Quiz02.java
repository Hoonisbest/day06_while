package day06_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c = 0 ,pass = 0, spass = 0;
		String log = null, sign = null ;
		while(true)
		{
		System.out.println("1.로그인");
		System.out.println("2.회원 가입");
		System.out.println("3.나가기");
		System.out.print("번호를 선택하시오:");
		c = input.nextInt();
		
		
		switch(c){
		case 1:
				if(sign == null) {
					System.out.println("가입부터 진행 하시오.");
					break;}
				else if(sign != null) {
				System.out.print("아이디 입력 : ");
				log = input.next();
				System.out.print("비밀번호 입력 : ");
				pass = input.nextInt();}
				if(log.equals(sign) && pass == spass) {
				System.out.println("인증성공");
				System.exit(1);
				}
				else if(log.equalsIgnoreCase(sign) || pass !=spass) {
					System.out.println("인증실패!!!");	
				}break;
				
		case 2 : System.out.print("저장할 아이디 입력 : ");
				 sign = input.next();
				 System.out.print("저장할 비밀번호 입력 : ");
				 spass = input.nextInt();
				 break;
		case 3 : System.exit(1);		 
		
		
		}
		
		}
		
		
		
		
		
		
		
		
	}
}
