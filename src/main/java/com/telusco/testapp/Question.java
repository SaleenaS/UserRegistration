package com.telusco.testapp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quetest")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String category;
    private String difficulty_level;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String question_title;
    private String right_answer;

}
