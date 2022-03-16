package com.te.learn.threadpractise;

public class Story {
	private static StringBuffer story = new StringBuffer("This is Java training fro beginners");

	public static void writeStory() {
		for (int i = 0; i < story.length(); i++) {
			story = story.replace(0, i, i + "!@#$%^");

		}

	}

	public static void readStory() {
		for (int i = 0; i < story.length(); i++) {
			System.out.println(story.charAt(i));
		}

	}

}
