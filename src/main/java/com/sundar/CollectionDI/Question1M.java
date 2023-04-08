package com.sundar.CollectionDI;

import java.util.Iterator;
import java.util.Map;

public class Question1M {
	
	private int quesNo;
	private String question;
	private Map<String,String> answer;
	
	public Question1M(int quesNo, String question, Map<String, String> answer) {
		super();
		this.quesNo = quesNo;
		this.question = question;
		this.answer = answer;
	}
	
    /*
	 *  public void display() {
	 *       System.out.println(quesNo+" . "+question);
	 *       Set set=answer.entrySet();
	 *       Iterator itr=set.iterator();
	 *       while(itr.hasNext()){
	 *             Map.Entry<String,String> map=(Map.Entry)itr.next();
	 *             System.out.println(map.getKey+" answer : "+getValue);
	 *       }
	 *  }
	 * 
	 */
	
	public void display() {
		System.out.println(quesNo+" . "+question);
	    for(Map.Entry<String, String> map:answer.entrySet()) {
	    	System.out.println(map.getKey()+" answer : "+map.getValue());
	    }
	}
}
