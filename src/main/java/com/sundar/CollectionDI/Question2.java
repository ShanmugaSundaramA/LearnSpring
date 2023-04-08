package com.sundar.CollectionDI;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question2 {
	   private int quesNo;
	   private String question;
	   private Map<Student2,Answer2> ansAndStu;

	public Question2(int quesNo, String question, Map<Student2, Answer2> ansAndStu) {
		super();
		this.quesNo = quesNo;
		this.question = question;
		this.ansAndStu = ansAndStu;
	}
	
	public void display() {
		System.out.println(quesNo+" . "+question);
		Set set=ansAndStu.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Student2,Answer2> entry=(Map.Entry<Student2,Answer2>)itr.next();
		    System.out.println(entry.getKey());
		    System.out.println(entry.getValue());
		}
    }
   
}
