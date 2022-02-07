package com.cursor.testing.hw10.calculator;


import com.cursor.testing.hw10.articles.*;
import org.springframework.stereotype.Component;

@Component
public class ArticleCalculator {

    public double calculate(String articles) {
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;
        char[] articlesArray = articles.trim().toUpperCase().toCharArray();
        for (char temp : articlesArray) {
            switch (temp) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        return performCalculations(aCount, bCount, cCount, dCount);
    }

    private double performCalculations(int aCount, int bCount, int cCount, int dCount) {
        double sum = 0.00;
        if (aCount != 0) {
            sum += aCount % ArticleA.promotionalNumber == 0 ?
                    aCount / ArticleA.promotionalNumber * ArticleA.promotionalPrice :
                    ((aCount % ArticleA.promotionalNumber) * ArticleA.price +
                            (aCount / ArticleA.promotionalNumber) * ArticleA.promotionalNumber);
        }
        if (bCount != 0) {
            sum += bCount * ArticleB.price;
        }
        if (cCount != 0) {
            sum += cCount % ArticleC.promotionalNumber == 0 ?
                    cCount / ArticleC.promotionalNumber * ArticleC.promotionalPrice :
                    ((cCount % ArticleC.promotionalNumber) * ArticleC.price +
                            (cCount / ArticleC.promotionalNumber) * ArticleC.promotionalNumber);
        }
        if (dCount != 0) {
            sum += dCount * ArticleD.price;
        }

        return sum;
    }
}
