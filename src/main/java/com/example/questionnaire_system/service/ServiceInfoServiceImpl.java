package com.example.questionnaire_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.questionnaire_system.entity.QuestionInfo;
import com.example.questionnaire_system.repository.FeedbackDao;
import com.example.questionnaire_system.repository.QuestionInfoDao;
import com.example.questionnaire_system.repository.QuestionOptionDao;
import com.example.questionnaire_system.repository.SurveyInfoDao;
import com.example.questionnaire_system.vo.SurveyRequest;
import com.example.questionnaire_system.vo.SurveyResponse;

@Service
public class ServiceInfoServiceImpl implements SurveyService {

	@Autowired
	SurveyInfoDao surveyInfoDao;

	@Autowired
	QuestionInfoDao questionInfoDao;

	@Autowired
	QuestionOptionDao questionOptionDao;

	@Autowired
	FeedbackDao feedbackDao;

	@Override
	public SurveyResponse createSurvey(SurveyRequest request) {
		// 前端需傳回問卷標題、開始時間、結束時間
		surveyInfoDao.save(request.getSurveyInfo());
		return new SurveyResponse("新增問卷成功");
	}

	@Override
	public SurveyResponse createSurveyQuestion(SurveyRequest request) {
		List<QuestionInfo> reqQuestionInfoList = request.getQuestionInfoList();
		questionInfoDao.saveAll(reqQuestionInfoList);
//		for (QuestionInfo reqQuestionInfo : reqQuestionInfoList) {
////			防呆
//		}
		questionOptionDao.saveAll(request.getQuestionOptionList());
//		之後要設防呆
		return new SurveyResponse("新增問題成功");
	}

//	回傳問卷ID(供新增問卷問題及選項使用)
	@Override
	public SurveyResponse returnServeyId(SurveyRequest request) {
		return new SurveyResponse(
				surveyInfoDao.findBySurveyTitle(request.getSurveyName()).getSurveyId());
	}

//	修改問卷
	@Override
	public SurveyResponse updateSurveyQuestion(SurveyRequest request) {
		QuestionInfo info = questionInfoDao
				.findByQuestionTitle(request.getQuestionTitle());
		questionInfoDao.save(request.getQuestionInfo());
		questionOptionDao.saveAll(request.getQuestionOptionList());
		return new SurveyResponse("修改成功");
	}

//	代入問題回傳該問題資訊給前端顯示
	@Override
	public SurveyResponse getServeyQuestion(SurveyRequest request) {
		return new SurveyResponse(
				questionOptionDao.findByQuestionTitle(request.getQuestionTitle()),
				questionInfoDao.findByQuestionTitle(request.getQuestionTitle()));
	}

	@Override
	public SurveyResponse deleteServey(SurveyRequest request) {

		surveyInfoDao.delete(surveyInfoDao.findBySurveyTitle(request.getSurveyName()));
		return new SurveyResponse("已刪除問卷");
	}

	@Override
	public SurveyResponse deleteQuestion(SurveyRequest request) {
		questionInfoDao
				.delete(questionInfoDao.findByQuestionTitle(request.getQuestionTitle()));
		return new SurveyResponse("已刪除問題");
	}

	// 將回答存入資料庫(前台功能暫時不寫)
	@Override
	public SurveyResponse storeFeedback(SurveyRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	// 取得問卷回答(需碰到前台，先不寫)
	@Override
	public SurveyResponse getFeedback(SurveyRequest request) {
		feedbackDao.findBySurveyIdAndUserEmailIs(0, null);
		return null;
	}

}
