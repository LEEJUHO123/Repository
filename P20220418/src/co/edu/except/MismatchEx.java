package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		while(true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택>");
			int menu = 0;
			try {
				Class.forName("Java.lang.String");//Exception
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}
			
			
			try {
				
				menu =Integer.parseInt(scn.next());//RuntimeException
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위 넘어서 처리하려고함.");
			}catch(InputMismatchException | NumberFormatException e2) {
				System.out.println("숫자선택.");
				scn.nextLine();
			}catch(Exception e3) {
				System.out.println("알 수 없는 예외 발생.");
			}finally {
				System.out.println("예외처리에서 반드시 한번은 실행.");
			}
			
			if(menu==1) {
				System.out.println("추가하시오.");
			}else if(menu==2) {
				break;
			}
		}
		}
}
