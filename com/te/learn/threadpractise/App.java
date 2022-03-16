package com.te.learn.threadpractise;

public class App {

	public static void main(String[] args) {
		MyCharThread myCharThread=new MyCharThread();
		MyIntThread intThread=new MyIntThread();
		myCharThread.start();
		intThread.start();
		

	}

}
