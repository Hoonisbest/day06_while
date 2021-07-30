package day06_while;

public class Quiz01 {
	public static void main(String[] args) {
		
	/*	int x = 0;
		for(int i = 1 ; i<=30 ; i++) {
			if(i==1) {
				x =1;
			}else {
			x*=2;}
		}System.out.println(x);*/
		
		
		int i,sum = 0, sum1 = 0;
		for(i=1;i<=1000;i++) {
			if(i%3==0 && i%5!=0)
				sum1+=i;
			sum +=i;
		}
		
		i=1; 
		sum=0;
		for(;sum<10000;i++) {
			if(i%2==1) {
				sum+=i;
			}
		
		}i--;
		System.out.println(i+"  : "+sum);
		

		
		
		}
	
}
		
	
	
	

