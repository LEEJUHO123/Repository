package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		int sum = 0;
		double avg;
		int[] number = new int[10];
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*(10-1)) +1;
			sum += number[i];
			
			
			avg = sum/number.length;
		
		if(number[i]>avg) {
			System.out.println(number[i]);
		}
		
		}
		
		
		
		
		
		
		
		
	}
}
