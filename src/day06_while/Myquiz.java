package day06_while;

import java.util.Scanner;

public class Myquiz {
	public static void main(String[] args) {
		
		//������ ���α׷�
		Scanner input = new Scanner(System.in);

        System.out.print("�� �Է� : ");
        int x = input.nextInt();
        
        
        for(int i=1; i<=x; i++) {
        	int sum = 0;
            for(int j=1; j<i; j++) {
                if(i%j==0) {
                    sum += j;
                }
            }
            if(i==sum) {
                System.out.println(i);
            }
        }
        	
        //�� ��� ���α׷�
        
        for (int i=0; i<5; i++) {
			for (int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
        //�� �Ƕ�̵�
		for( i = 0; i < 6; i++){

			for(int j = 15; j > i; j--){

			System.out.print(" ");

			}

			for(int k = 0; k < i * 2 - 1; k++){

			System.out.print("*");

			}

			System.out.println();

			}
		//�ð� ��� 
		for (int h = 0; h <= 23; h++) {
			for (int m = 0; m <= 59; m++) {
				  System.out.println(h + "��" + m + "��" );
				 
				}
			}
		
		//2������ �����
		for ( i =1;i<=10;i++) {
			for(int j =1;j<=10;j++) {
				System.out.println("*");
			}
		}
			



		
		

		}




        
        } 
	}   
        
    




