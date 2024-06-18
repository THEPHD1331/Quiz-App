package com.quiz.service;

import com.quiz.entity.Question;
import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestion();
    Question getById(int quesId);
    Question addQuestion(Question question);
    List<Question> getByQuizId(int quizId);
}
