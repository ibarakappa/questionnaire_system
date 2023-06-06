package com.example.questionnaire_system.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.questionnaire_system.entity.QuestionOption.QuestionOptionId;

@Entity
@IdClass(QuestionOptionId.class)
@Table(name = "question_option")
public class QuestionOption implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "question_id")
	private Integer questionId;

	@Id
	@Column(name = "question_title")
	private Integer questionTitle;

	@Column(name = "option_content")
	private String optionContent;

	@Column(name = "question_type")
	private Integer questionType;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getOptionContent() {
		return optionContent;
	}

	public void setOptionContent(String optionContent) {
		this.optionContent = optionContent;
	}

	public Integer getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(Integer questionTitle) {
		this.questionTitle = questionTitle;
	}

	public Integer getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}

	public static class QuestionOptionId implements Serializable {
		private static final long serialVersionUID = 1L;
		private Integer questionId;
		private Integer questionTitle;

		public Integer getQuestionId() {
			return questionId;
		}

		public void setQuestionId(Integer questionId) {
			this.questionId = questionId;
		}

		public Integer getQuestionTitle() {
			return questionTitle;
		}

		public void setQuestionTitle(Integer questionTitle) {
			this.questionTitle = questionTitle;
		}

	}
}
