package com.quiz.controller;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping
    List<Quiz> getAll(){
        return quizService.getAllQuiz();
    }

    @GetMapping("/{id}")
    Quiz getQuizById(@PathVariable int id){
        return quizService.getQuizById(id);
    }

    @PostMapping
    Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.createQuiz(quiz);
    }

}
