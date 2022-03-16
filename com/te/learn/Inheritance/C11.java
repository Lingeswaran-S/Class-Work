package com.te.learn.Inheritance;

public class C11 extends A11 {
	private int ff = 34;
	private int ee = 33;

	public C11() {
		super();
	}

	public C11(int ff, int ee) {
		super();
		this.ff = ff;
		this.ee = ee;
	}

	public int getFf() {
		return ff;
	}

	public void setFf(int ff) {
		this.ff = ff;
	}

	public int getEe() {
		return ee;
	}

	public void setEe(int ee) {
		this.ee = ee;
	}

}
