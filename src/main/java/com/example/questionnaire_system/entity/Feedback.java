package com.example.questionnaire_system.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "survey_id")
	private Integer surveyId;

	@Id
	@Column(name = "done_time")
	private Date doneTime;

	@Column(name = "question_id")
	private String questionId;

	@Column(name = "question_num")
	private Integer questionNum;

	@Column(name = "user_email")
	private Integer userEmail;

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public Integer getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(Integer questionNum) {
		this.questionNum = questionNum;
	}

	public Date getDoneTime() {
		return doneTime;
	}

	public void setDoneTime(Date doneTime) {
		this.doneTime = doneTime;
	}

	public Integer getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(Integer userEmail) {
		this.userEmail = userEmail;
	}

	public static class FeedbackId implements Serializable {
		private static final long serialVersionUID = 1L;

		private Integer surveyId;

		private Date doneTime;

		public Integer getSurveyId() {
			return surveyId;
		}

		public void setSurveyId(Integer surveyId) {
			this.surveyId = surveyId;
		}

		public Date getDoneTime() {
			return doneTime;
		}

		public void setDoneTime(Date doneTime) {
			this.doneTime = doneTime;
		}

	}
}
