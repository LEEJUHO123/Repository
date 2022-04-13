package co.edu.array;

public class ArrayExample {
	public static void main(String[] args) {
	//학생의 점수 30명.
		int score1 = 80;
		
		int score30 = 78;
		
		//여러개의 같은 유형의 값을 저장.
		int[] intAry = new int[30]; // 정수 int 30개 담을 공간. intary 는 정수 30개를 담을 수 있음
									// 정수형의 기본값이 30이 됨.
									// []는 정수를 담는 배열변수 <- 인덱스는 0부터 시작.
		intAry[0] = 30;
		intAry[4] = 40;
		intAry[29] = 55;
		
		System.out.println(intAry[0]);
	
		
		
		double[] ab1Ary = new double[10];	//double 저장 10개 선언.
		
		String[] strAry = new String[5]; // 참조타입변수 => null.
		System.out.println(strAry[0]);
		
		
		int[] otherAry = {10, 20, 30, 40}; // 초기값을 지정.
		int[] theOtherAry = {10, 20, 30, 40};
		System.out.println(otherAry[0]);	//otherAry는 참조변수지만 여기 otherAry[0]를 따라가보면 실제 값임.
	
		if(otherAry[0] == theOtherAry[0]) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
	}
}
