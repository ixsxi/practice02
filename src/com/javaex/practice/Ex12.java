package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호:");
		String w = sc.nextLine();
		
		System.out.print("숫자1:");
		double num1 =sc.nextDouble();
		
		System.out.print("숫자2:");
		double num2 =sc.nextDouble();
		
		
		switch(w) {
		case "+": System.out.println("결과는: "+(num1+num2));
					break;
		
		case "-": System.out.println("결과는: "+(num1-num2));
					break;
		
		case "/": System.out.println("결과는:" +(num1/num2));
			if(num2 == 0) {
				System.out.println("계산할수 없습니다.");
			}else {
				
			}
					break;
		case "*": System.out.println("결과는:" +(num1*num2));
				break;
		
		default:System.out.println("계산할수 없는 기호입니다.");
			break;
		}
		
		
		
		
		
		
		sc.close();
	}

}
