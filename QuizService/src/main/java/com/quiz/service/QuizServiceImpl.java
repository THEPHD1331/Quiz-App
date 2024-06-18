package com.quiz.service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    QuizRepository quizRepo;

    @Autowired
    QuestionClient questionClient;

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizzes = quizRepo.findAll();
        List<Quiz> quizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return quizList;
    }

    @Override
    public Quiz getQuizById(int id) {
        Quiz quiz1 = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found!"));
        quiz1.setQuestions(questionClient.getQuestionsOfQuiz(quiz1.getId()));
        return quiz1;
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepo.save(quiz);
    }
}
