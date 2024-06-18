package com.quiz.controller;

import com.quiz.entity.Question;
import com.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping
    List<Question> getAll() {
        return questionService.getAllQuestion();
    }

    @GetMapping("/{quesId}")
    Question getById(@PathVariable int quesId) {
        return questionService.getById(quesId);
    }

    @PostMapping
    Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @PutMapping
    Question updateQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping("/quiz/{quizId}")
    List<Question> getByQuizId(@PathVariable int quizId){
        return questionService.getByQuizId(quizId);
    }
}
