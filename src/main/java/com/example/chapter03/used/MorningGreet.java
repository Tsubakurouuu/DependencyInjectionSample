package com.example.chapter03.used;

import org.springframework.stereotype.Component;


public class MorningGreet implements Greet {

	@Override
	public void greeting() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("---------");
		System.out.println("おはようございます！");
		System.out.println("---------");
	}

}
