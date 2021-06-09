package com.javaex.practice;

import java.util.Scanner;

public class Ex05_ {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("키와 몸무게를 입력하세요");
		System.out.println("키");
		int k =sc.nextInt();
		System.out.println("몸무게");
		int m=sc.nextInt();
		
	
		double val =0;
		 val = (k-100)*0.9 ;   //표준체중 
		
		 if(m<val) {
			 System.out.println("저체중입니다");
		 }else if(m>val){
			 System.out.println("뚱땡이입니다");
		 }else if(m==val) {
			 System.out.println("정상입니다.");
		 }
		 System.out.println("표준체중"+val);
	}

}
