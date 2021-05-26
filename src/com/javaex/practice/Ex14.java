package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double m = sc.nextDouble();

		if(m>0 && m<=1000) {
			System.out.println("소득세는"+0.09*m+"입니다.");	
		}else if(m>1000 && m<=4000) {
			System.out.println("소득세는"+(1000*0.09 + 0.18*(m-1000))+"입니다");
		}else if(m>4000 && m<8000) {
			System.out.println("소득세는"+(1000*0.09+3000*0.18+0.27*(m-4000)));
		}else if(m>=8000) {
			System.out.println("소득세는"+(1000*0.09+3000*0.18+4000*0.27+0.36*(m-8000)));
		}
		else {
			System.out.println("잘못입력했습니다");
			
		}
		
		sc.close();
		
	}
}

