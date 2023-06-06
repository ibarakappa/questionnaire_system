package com.example.questionnaire_system.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_info")
public class SurveyInfo {
	@Id
	@Column(name = "survey_id")
	private Integer surveyId;

	@Column(name = "survey_title")
	private String surveyTitle;

	@Column(name = "survey_time")
	private Date startTime;

	@Column(name = "end_time")
	private Date endTime;

	public SurveyInfo() {
		super();
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyTitle() {
		return surveyTitle;
	}

	public void setSurveyTitle(String surveyTitle) {
		this.surveyTitle = surveyTitle;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
