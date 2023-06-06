package com.example.questionnaire_system.vo;

import java.util.List;

import com.example.questionnaire_system.entity.Feedback;
import com.example.questionnaire_system.entity.QuestionInfo;
import com.example.questionnaire_system.entity.QuestionOption;
import com.example.questionnaire_system.entity.SurveyInfo;

public class SurveyResponse {
//	問卷名稱
	private String SurveyName;
//	問卷資訊
	private SurveyInfo surveyInfo;
//	問卷feedback
	private Feedback feedback;
//	問卷feedbackList
	private List<Feedback> feedbackList;
//	問卷選項
	private QuestionOption questionOption;
//	問卷選項LIST
	private List<QuestionOption> questionOptionList;
//	問卷問題
	private QuestionInfo questionInfo;
//	系統訊息
	private String message;
//	問卷ID
	private Integer surveyId;
//	問卷問題ID
	private Integer questionInfoId;

	public SurveyResponse(List<Feedback> feedbackList) {
		super();
		this.feedbackList = feedbackList;
	}

	public SurveyResponse(List<QuestionOption> questionOptionList,
			QuestionInfo questionInfo) {
		super();
		this.questionOptionList = questionOptionList;
		this.questionInfo = questionInfo;
	}

	public SurveyResponse(QuestionInfo questionInfo) {
		super();
		this.questionInfo = questionInfo;
	}

	public SurveyResponse(Integer surveyId) {
		super();
		this.surveyId = surveyId;
	}

	public SurveyResponse(String message) {
		super();
		this.message = message;
	}

	public String getSurveyName() {
		return SurveyName;
	}

	public void setSurveyName(String surveyName) {
		SurveyName = surveyName;
	}

	public SurveyInfo getSurveyInfo() {
		return surveyInfo;
	}

	public void setSurveyInfo(SurveyInfo surveyInfo) {
		this.surveyInfo = surveyInfo;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public QuestionOption getQuestionOption() {
		return questionOption;
	}

	public void setQuestionOption(QuestionOption questionOption) {
		this.questionOption = questionOption;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public Integer getQuestionInfoId() {
		return questionInfoId;
	}

	public void setQuestionInfoId(Integer questionInfoId) {
		this.questionInfoId = questionInfoId;
	}

	public QuestionInfo getQuestionInfo() {
		return questionInfo;
	}

	public void setQuestionInfo(QuestionInfo questionInfo) {
		this.questionInfo = questionInfo;
	}

	public List<QuestionOption> getQuestionOptionList() {
		return questionOptionList;
	}

	public void setQuestionOptionList(List<QuestionOption> questionOptionList) {
		this.questionOptionList = questionOptionList;
	}

	public List<Feedback> getFeedbackList() {
		return feedbackList;
	}

	public void setFeedbackList(List<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}

}
