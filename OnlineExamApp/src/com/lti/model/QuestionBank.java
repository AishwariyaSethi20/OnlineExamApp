package com.lti.model;
import java.util.*;


public class QuestionBank {

	//subject wise list of questions
	private Map<String, List<Question>> questionBank= new HashMap<>();
	
	public void addNewSubject(String subjectName) {
		questionBank.put(subjectName, new ArrayList<>());
	}

	public void addNewQuestion(String subjectName, Question question) {
		List<Question> questions= questionBank.get(subjectName);
		questions.add(question);
	}
	public List<Question> getQuestionsFor(String subjectName){
		return questionBank.get(subjectName);
	}
}
