package com.te.learn.threadpractise;

public class MyIntThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("Integer "+i);
		}
	}

}
