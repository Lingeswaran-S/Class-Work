package com.te.learn.runnablethread;

import com.te.learn.threadpractise.Story;

public class MyInt implements Runnable {
	public void run() {
		Story.readStory();
	}

}
