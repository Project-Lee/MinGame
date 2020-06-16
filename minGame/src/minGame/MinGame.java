package minGame;

import java.util.Scanner;

public class MinGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		int number = 0;
		int user = 0;
		
		int num = (int)(Math.random() * 100 + 1);
		System.out.println("정답 : " + num);		
		System.out.println("숫자 입력");
		user = scan.nextInt();
		
		if(user > num) {
			int sum = user - num;
			System.out.printf("범위가 %d 차이납니다\n",sum);
		} else if (user < num) {
			int sum = num - user;
			System.out.printf("범위가 %d 차이납니다\n",sum);
		}

	}

}
