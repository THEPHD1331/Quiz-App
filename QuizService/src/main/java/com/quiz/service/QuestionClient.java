package com.quiz.service;

import com.quiz.entity.QuestionTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// Feign is a declarative rest client for sync, non-reactive web apis
//@FeignClient(url = "http://localhost:9022", value = "Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
@Lazy
public interface QuestionClient {

    @GetMapping("/questions/quiz/{quizId}")
    List<QuestionTO> getQuestionsOfQuiz(@PathVariable int quizId);
}
