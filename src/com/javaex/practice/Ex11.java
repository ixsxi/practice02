package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자를) 입력하세요");
		System.out.print("알파벳: ");
		String eng = sc.nextLine();
		
		
		switch(eng) {
			case "a":
			case "e":
			case "i":
			case "u":
			case "o":
			System.out.println("모음");
			break;
			
			default :
			System.out.println("자음");
			break;
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
