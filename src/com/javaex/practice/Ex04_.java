package com.javaex.practice;

import java.util.Scanner;

public class Ex04_ {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
				
		System.out.println("나이를 입력해주세요");
		System.out.println("나이");
		int age =sc.nextInt();
		
		if(age>=19 && age<65) {
			System.out.println("1그룹");
		}else {
			System.out.println("2번그룹");
		}
		

	}

}
