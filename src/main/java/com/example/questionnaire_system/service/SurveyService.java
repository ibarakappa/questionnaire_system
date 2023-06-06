package com.example.questionnaire_system.service;

import org.springframework.stereotype.Service;

import com.example.questionnaire_system.vo.SurveyRequest;
import com.example.questionnaire_system.vo.SurveyResponse;

@Service
public interface SurveyService {
	// 建立問卷基本資訊
	public SurveyResponse createSurvey(SurveyRequest request);

	// 建立問卷問題及選項
	public SurveyResponse createSurveyQuestion(SurveyRequest request);

	// 修改問卷
	public SurveyResponse updateSurveyQuestion(SurveyRequest request);

	// 前端點擊問題標題自動帶入問題值
	public SurveyResponse getServeyQuestion(SurveyRequest request);

	// 取得問卷ID
	public SurveyResponse returnServeyId(SurveyRequest request);

	// 刪除問卷
	public SurveyResponse deleteServey(SurveyRequest request);

	// 刪除題目
	public SurveyResponse deleteQuestion(SurveyRequest request);

	// 將回答存入資料庫(前台功能)
	public SurveyResponse storeFeedback(SurveyRequest request);

	// 取得所有回答(碰到前台先不寫)
	public SurveyResponse getFeedback(SurveyRequest request);

}
