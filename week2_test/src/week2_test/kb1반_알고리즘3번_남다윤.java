package week2_test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kb1반_알고리즘3번_남다윤 {

	static int[] v;
	static int N, M;
	static int max=1; //덩어리 최대 크기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 직선 구간의 길이
		M = sc.nextInt(); // 제한시간
		v = new int[N + 1]; // 가중치

		for (int i = 1; i <= N; i++)
			v[i] = sc.nextInt(); //1~N까지 경로의 가중치 입력받음

		
		func(1,0,0,1);//덩어리크기 1, 뚱이 처음 위치 0, 0초 경과, 밀기(1)
		func(1,0,0,2);//덩어리크기 1, 뚱이 처음 위치 0, 0초 경과, 던지기(2)
		
		System.out.println(max);

	}

	private static void func(int val,int x, int t,int ver) {
		//M초인 경우 덩어리중 가장 큰 덩어리크기 저장
		//이동한 경로가 범위에 벗어난 경우 굴리기 종료
		if(x>N || t==M) { 
			if(val>max) max=val;
			return;
		}
		if(ver==1 && x+1<=N) { //밀기
			val+=v[x+1];
			func(val,x+1,t+1,1); 
			func(val,x+1,t+1,2);
		}else if(ver==2&&x+2<=N) { //던지기
			val=val/2+v[x+2];
			func(val,x+2,t+1,1);
			func(val,x+2,t+1,2);
		}
		
	}// end main

	

}
