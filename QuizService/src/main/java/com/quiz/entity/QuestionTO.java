package com.quiz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuestionTO {

    private int quesId;
    private String question;
    private int quizId;
}
