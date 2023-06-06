package com.example.questionnaire_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questionnaire_system.entity.QuestionOption;
import com.example.questionnaire_system.entity.QuestionOption.QuestionOptionId;

public interface QuestionOptionDao
		extends JpaRepository<QuestionOption, QuestionOptionId> {
	public List<QuestionOption> findByQuestionTitle(String title);
}
