package com.quiz.service;

import com.quiz.entity.Quiz;

import java.util.List;

public interface QuizService {

    List<Quiz> getAllQuiz();
    Quiz getQuizById(int id);
    Quiz createQuiz(Quiz quiz);
}
