package com.example.questionnaire_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questionnaire_system.entity.SurveyInfo;

public interface SurveyInfoDao extends JpaRepository<SurveyInfo, Integer> {

	public SurveyInfo findBySurveyTitle(String surveyTitle);
}
