package co.edu.array;

public class ArrayExample7 {
	public static void main(String[] args) {
		
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int month = 6;
		int lnth = getLastDay(month);
		int[] intAry = new int[lnth]; //31개 짜리 크기를 선언
		// 배열값을 지정.
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = i + 1;
		}
		//요일출력부분
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		int spaces = getDayInfo(month);
		for(int i=0; i<spaces; i++) {
			System.out.printf("%4s", " ");
		}
		//날짜 출력
		for(int i=0; i<intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spaces) % 7 == 6) {
				System.out.println();	//줄바꿈.
			}
		}
		
	} // end of main();
	public static int getLastDay(int month) {
		switch(month) {
		case 4:
			return 30;
		
		case 5 : 
			return 31; // 마지막 날짜.
			
		case 6 :
			return 30;
			
		default : 
				return 0;
		}
	}
	
	public static int getDayInfo(int month) {
		switch(month) {
		case 4:
			return 5;
		
		case 5 : 
			return 0; //요일정보. break 할필요없음.
			
		case 6 :
			return 3;
			
		default : 
				return 0;
		}
	}

}
