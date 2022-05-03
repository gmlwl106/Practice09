package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		
    		String str = sc.nextLine();
    		
    		if(str.equals("q")) {
    			break;
    		} else {
    			String[] goods = str.split(","); //문자열 나누기
    			
    			//gList에 입력받은 goods 추가
    			//가격과 갯수는 int로 형변환
    			gList.add(new Goods(goods[0], Integer.parseInt(goods[1]), Integer.parseInt(goods[2])));
    		}
    	
    	}
    	System.out.println("[입력완료]");
    	System.out.println("===========================================================");
    	
    	for(Goods g : gList) {
    		g.showGoods();
    		sum += g.getCount();
    	}
    	System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
    	
    	
    	
    	sc.close();

    }

}
