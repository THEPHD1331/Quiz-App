package com.quiz.service;

import com.quiz.entity.Question;
import com.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepo;

    @Override
    public List<Question> getAllQuestion() {
        return questionRepo.findAll();
    }

    @Override
    public Question getById(int quesId) {
        return questionRepo.findById(quesId).orElseThrow(() -> new RuntimeException("Question Not Found!"));
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> getByQuizId(int quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
