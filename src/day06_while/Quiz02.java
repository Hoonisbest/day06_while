package day06_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c = 0 ,pass = 0, spass = 0;
		String log = null, sign = null ;
		while(true)
		{
		System.out.println("1.�α���");
		System.out.println("2.ȸ�� ����");
		System.out.println("3.������");
		System.out.print("��ȣ�� �����Ͻÿ�:");
		c = input.nextInt();
		
		
		switch(c){
		case 1:
				if(sign == null) {
					System.out.println("���Ժ��� ���� �Ͻÿ�.");
					break;}
				else if(sign != null) {
				System.out.print("���̵� �Է� : ");
				log = input.next();
				System.out.print("��й�ȣ �Է� : ");
				pass = input.nextInt();}
				if(log.equals(sign) && pass == spass) {
				System.out.println("��������");
				System.exit(1);
				}
				else if(log.equalsIgnoreCase(sign) || pass !=spass) {
					System.out.println("��������!!!");	
				}break;
				
		case 2 : System.out.print("������ ���̵� �Է� : ");
				 sign = input.next();
				 System.out.print("������ ��й�ȣ �Է� : ");
				 spass = input.nextInt();
				 break;
		case 3 : System.exit(1);		 
		
		
		}
		
		}
		
		
		
		
		
		
		
		
	}
}
