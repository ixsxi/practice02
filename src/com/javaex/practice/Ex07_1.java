package com.javaex.practice;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num, num2;
		int val1;
		int val2;
		int val3;
		int val4;
		
		System.out.println("첫번째 숫자");
		num = sc.nextInt();
		System.out.println("두번째 숫자");
		num2 = sc.nextInt();
		
		
		if(num >num2  ) {
			val1 = num/num2; 
			val2 = num%num2;
			System.out.print("몫"+val1);
			System.out.println("나머지"+val2);
			
		}else if(num2>num) {
			val3 =num2/num;
			val4 =num2%num;
			System.out.print("몫"+val3);
			System.out.println("나머지"+val4);
		}else if(num == num2) {
			System.out.println("몫"+num/num2);
			System.out.println("나머지"+num%num2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
