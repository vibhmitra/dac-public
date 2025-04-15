package com.marks.model;

public class Marks {
	private int english, science, maths;

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public String toString() {
		return ("" + (this.english + this.maths + this.science));
	}
	
	
}
