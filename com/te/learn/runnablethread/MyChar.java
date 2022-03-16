package com.te.learn.runnablethread;

import com.te.learn.threadpractise.Story;

public class MyChar implements Runnable {

	public void run() {
		Story.writeStory();

	}

}
