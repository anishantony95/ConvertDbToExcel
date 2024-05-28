package com.example.demo;

import javax.persistence.GenerationType;

@javax.persistence.Entity

public class ExamRecord {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getExamYear() {
		return examYear;
	}
	public void setExamYear(int examYear) {
		this.examYear = examYear;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String studentName;
	private int examYear;
	private int score;
	
	

}
