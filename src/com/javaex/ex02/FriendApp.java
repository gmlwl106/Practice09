package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요 (이름 휴대폰 학교)");
    	
    	//친구 등록
    	for(int i=0; i<3; i++) {
    		String[] friend = sc.nextLine().split(" "); //문자열 공백으로 나누기
    		fList.add(new Friend(friend[0], friend[1], friend[2]));
    	}
    	
    	//친구 정보 출력
    	for(Friend f : fList) {
    		f.showFriends();
    	}
    	
    	
    }

}
