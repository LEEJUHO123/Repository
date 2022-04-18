package co.edu.array;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] intAry = {78, 83, 88, 92, 63, 44};
		
		//합을 구하는 코드. sum 선언.
		//for 반복문 써서 합계 만들기
		//double avg 평균.
		// 짝수인 것들을 데이터로 가져와서 더한 뒤 평균을 구함.
		// 
		int cnt = 0;
		double avg = 0;
		int sum = 0;
		for(int i = 0; i<intAry.length; i++) {
			if (intAry[i]%2 == 0) { //intAry[i] 는 값, i는 몇번째인지
				sum += intAry[i];
				cnt++; 
			}
		
		}
		
		avg =  1.0 *sum / cnt; // for 더블타입 연산
		
		
		System.out.println("합계" + sum);
		System.out.println("평균"+ avg);
		
		}
		
	}


