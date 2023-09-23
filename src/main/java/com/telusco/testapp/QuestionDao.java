package com.telusco.testapp;

import com.telusco.testapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface QuestionDao extends JpaRepository<Question,Integer>
{

List<Question>findBycategory(String category);

}
