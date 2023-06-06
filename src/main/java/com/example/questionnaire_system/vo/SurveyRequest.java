package com.example.questionnaire_system.vo;

import java.util.List;

import com.example.questionnaire_system.entity.Feedback;
import com.example.questionnaire_system.entity.QuestionInfo;
import com.example.questionnaire_system.entity.QuestionOption;
import com.example.questionnaire_system.entity.SurveyInfo;

public class SurveyRequest {
//	問卷名稱
	private String surveyName;
//	問卷問題選項
	private List<QuestionOption> questionOptionList;
//	問卷資訊
	private SurveyInfo surveyInfo;
//	問卷feedback
	private Feedback feedback;
//	問題資訊LIST
	private List<QuestionInfo> questionInfoList;
//	問題資訊
	private QuestionInfo questionInfo;
//	問題題目
	private String questionTitle;

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
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

	public List<QuestionOption> getQuestionOptionList() {
		return questionOptionList;
	}

	public void setQuestionOptionList(List<QuestionOption> questionOptionList) {
		this.questionOptionList = questionOptionList;
	}

	public List<QuestionInfo> getQuestionInfoList() {
		return questionInfoList;
	}

	public void setQuestionInfoList(List<QuestionInfo> questionInfoList) {
		this.questionInfoList = questionInfoList;
	}

	public QuestionInfo getQuestionInfo() {
		return questionInfo;
	}

	public void setQuestionInfo(QuestionInfo questionInfo) {
		this.questionInfo = questionInfo;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

}
