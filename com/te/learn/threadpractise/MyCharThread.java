package com.te.learn.threadpractise;

public class MyCharThread extends Thread {
	public void run(){
		for(char c='a';c<='z';c++) {
			System.out.println("Char :"+c);
		}
	}
	
	
	
	

}
