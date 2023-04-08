package com.sundar.CollectionDI;

public class Answer {
	private int id;
	private String name;
	private String answer;
	public Answer(int id, String name, String answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", answer=" + answer + "]";
	}

}
