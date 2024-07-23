package com.sivaTejaswi.quizapp.dao;

import com.sivaTejaswi.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
