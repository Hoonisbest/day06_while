package day06_while;

import java.util.Scanner;

public class Myquiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("╪Ж ют╥б : ");
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++) {
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

    }

}


