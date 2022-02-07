package com.cursor.testing.hw10;

import com.cursor.testing.hw10.articles.ArticleA;
import com.cursor.testing.hw10.articles.ArticleB;
import com.cursor.testing.hw10.calculator.ArticleCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw10UnitIntegrationTestingApplication {

    public static void main(String[] args) {
        ArticleCalculator calculator = new ArticleCalculator();
        System.out.println(calculator.calculate("ABCDABA"));
//        SpringApplication.run(Hw10UnitIntegrationTestingApplication.class, args);
    }

}
