package com.sundar.CollectionDI;

public class Answer2 {
	private String answer;
	private String postedDate;
	public Answer2(String answer, String postedDate) {
		super();
		this.answer = answer;
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "[Answer=" + answer + ", PostedDate=" + postedDate + "]";
	}

}
