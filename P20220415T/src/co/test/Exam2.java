package co.test;

import java.util.Scanner;

// 조건문과 반복문.
// 
// Math.random()을 사용해서 1  ~ 10사이의 임의의 수를 추출.(10번 반복작업 수행) 
// 2의 배수와 3의 배수의 합계를 각각 구하도록 하세요.
// 6의 경우에는 2와 3의 배수이므로 2의 배수와 3의 배수의 합계에 각각 더해지도록 하세요.
// 2의 배수의 합은 : 26 , 3의 배수의 합 : 27
public class Exam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int getRandomValue = (int)(Math.random()*(10-1)) + 1;
		System.out.println(getRandomValue);
		
		int result=0;
		int num=0;
		
		for(int i=0; i<=10; i++ ) {
			if((i%2)==0) {
			
				result += i;	
			}
		}
	System.out.println("2의 배수의 합은 "+result);
	
	for(int j=0; j<=10; j++) {
		if((j%3)==0) {
			result += j;
		}
	}
		System.out.println("3의 배수의 합은"+result);
		
	
		
		
	}
}
