package com.te.learn.overriding;

public class Miui extends Android {
	private String osName;
	private String modelName;
	private int Weight;
	public Miui() {
		super();
	}

	public Miui(String osName, String modelName, int weight) {
		super();
		this.osName = osName;
		this.modelName = modelName;
		Weight = weight;
	}

	

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	@Override
	public void runOS() {
		System.out.println("Mi Advanced Code for basic to run os executed");
	}

	@Override
	public String toString() {
		return "Miui [osName=" + osName + ", modelName=" + modelName + ", Weight=" + Weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Weight;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((osName == null) ? 0 : osName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	Oxygen mii=(Oxygen) obj;
	if(this.Weight==mii.weight) {
		return true;
	}
	return false;
		
		
	}
	

}
