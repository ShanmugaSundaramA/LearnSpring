package com.sundar.CollectionDI;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int quesNo;
	private String question;
	private List<Answer> ans;
	public Question(int quesNo, String question, List<Answer> ans) {
		super();
		this.quesNo = quesNo;
		this.question = question;
		this.ans = ans;
	}
	
	public void display() {
		System.out.println(quesNo+" . "+question);
		Iterator<Answer> itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
	}
	
}
