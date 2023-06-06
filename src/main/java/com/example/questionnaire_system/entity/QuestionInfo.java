package com.example.questionnaire_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_info")
public class QuestionInfo {
	@Id
	@Column(name = "question_id")
	private Integer questionId;

	@Column(name = "question_title")
	private String questionTitle;

	@Column(name = "question_describe")
	private String questionDescribe;

	@Column(name = "question_type")
	private boolean questionType;

	@Column(name = "survey_id")
	private Integer surveyId;

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDescribe() {
		return questionDescribe;
	}

	public void setQuestionDescribe(String questionDescribe) {
		this.questionDescribe = questionDescribe;
	}

	public boolean getQuestionType() {
		return questionType;
	}

	public void setQuestionType(boolean questionType) {
		this.questionType = questionType;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

}
