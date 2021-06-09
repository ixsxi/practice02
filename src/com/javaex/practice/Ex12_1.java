package com.javaex.practice;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		double num1, num2; 
		String giho;
		double val1 =0;
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.println("기호");
		giho = sc.nextLine();
		System.out.println("숫자1");
		num1 = sc.nextDouble();
		System.out.println("숫자2");
		num2 = sc.nextDouble();

		
		if(giho.equals ("+")) {   // + 는 문자열 취급이라  +/* 등 변수.equals(+) 로해야함 
			val1 = val1+num1+num2;
			System.out.println("결과값"+val1);
			
		}else if(giho == "-") {
			System.out.println("결과는:"+(num1 - num2) );
		
		}else {
			System.out.println("");
		}
		
		
		
		
		sc.close();
	}

}
