package com.javaex.practice;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int num, num2 ;
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자 1 : ");
		num = sc.nextInt();
		
		
		System.out.print("숫자 2 : ");
		num2 = sc.nextInt();
		
		
		if(num>num2) {
			System.out.print("큰수:"+num);
			System.out.print("작은수:"+num2);
			
		}else if(num2>num) {
			System.out.print("큰수:"+num2);
			System.out.print("작은수:"+num);
			
			
		}else {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
