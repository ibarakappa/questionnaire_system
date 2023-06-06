package com.example.questionnaire_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questionnaire_system.entity.QuestionInfo;

public interface QuestionInfoDao extends JpaRepository<QuestionInfo, Integer> {
	public QuestionInfo findByQuestionTitle(String title);
}
