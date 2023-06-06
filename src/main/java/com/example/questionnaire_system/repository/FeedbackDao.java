package com.example.questionnaire_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questionnaire_system.entity.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback, Integer> {
	public List<Feedback> findBySurveyIdAndUserEmailIs(int id, String email);
}
