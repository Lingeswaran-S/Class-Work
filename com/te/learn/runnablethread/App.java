package com.te.learn.runnablethread;

public class App {

	public static void main(String[] args) {
		Thread thread01 = new Thread(new MyInt());
		Thread thread02 = new Thread(new MyChar());

		thread01.start();
		thread02.start();

	}

}
