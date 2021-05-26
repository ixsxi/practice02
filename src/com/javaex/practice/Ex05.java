package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:");
		int toll = sc.nextInt();
		System.out.print("몸무게:");
		int weight = sc.nextInt();
		
		double sum = (toll-100)*0.9; // 72 가 몸무게 보다 크냐작냐
		
		
		if(sum > weight) {
			System.out.println("저체 중입니다.");
		}else if(sum == weight) {
			System.out.println("표준 입니다.");
		}else if( sum >=72.0) {
			System.out.println("과체 중입니다.");
		}else {
	
		}
	
		System.out.println("표준체중:"+sum);
		
		
		sc.close();
	}

}
