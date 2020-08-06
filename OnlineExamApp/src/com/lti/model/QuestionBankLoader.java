package com.lti.model;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {

	public List<Question> LoadQuestionsOnJava() {
	String subjectName = "Java";
	
	QuestionBank qb= new QuestionBank(); 
	qb.addNewSubject(subjectName);
	
	Question q= new Question("What is java?", Difficulty.EASY);
	List<Option> ops= new ArrayList<Option>();
	//one question
	ops.add(new Option("Java is a DB", false));
	ops.add(new Option("Java is a programming language", true));
	ops.add(new Option("Java is an OS", false));
	ops.add(new Option("Java is a filesystem", false));
	
	q.setOptions(ops);
	qb.addNewQuestion(subjectName,q);
	
	//add 4 more qstns
	q= new Question("What is G1?", Difficulty.EASY);
	ops= new ArrayList<Option>();
	
	ops.add(new Option("G1 is a garbage collector in java", true));
	ops.add(new Option("G1 is english word for jeevan", false));
	ops.add(new Option("G1 is spy agency name", false));
	ops.add(new Option("G1 is sequel of SRK's Ra.one", false));
	
	q.setOptions(ops);
	qb.addNewQuestion(subjectName,q);
	
	return qb.getQuestionsFor(subjectName);
	
	}
}
