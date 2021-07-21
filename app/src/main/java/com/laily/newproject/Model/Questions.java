package com.laily.newproject.Model;

public class Questions {
    public static final String CATEGORY_QUIZ1 = "Quiz1";
    public static final String CATEGORY_QUIZ2 = "Quiz2";
    public static final String CATEGORY_QUIZ3 = "Quiz3";
    public static final String CATEGORY_QUIZ4 = "Quiz4";
    public static final String CATEGORY_QUIZ5 = "Quiz5";
    public static final String CATEGORY_QUIZ6 = "Quiz6";
    public static final String CATEGORY_QUIZ7 = "Quiz7";
    public static final String CATEGORY_QUIZ8 = "Quiz8";
    public static final String CATEGORY_QUIZ9 = "Quiz9";
    public static final String CATEGORY_QUIZ10 = "Quiz10";


    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private int answerNr;

    private String category;
    public Questions() {

    }

    public static String getCategoryQuiz1() {
        return CATEGORY_QUIZ1;
    }

    public static String getCategoryQuiz2() {
        return CATEGORY_QUIZ2;
    }

    public static String getCategoryQuiz3() {
        return CATEGORY_QUIZ3;
    }

    public static String getCategoryQuiz4() {
        return CATEGORY_QUIZ4;
    }

    public static String getCategoryQuiz5() {
        return CATEGORY_QUIZ5;
    }

    public static String getCategoryQuiz6() {
        return CATEGORY_QUIZ6;
    }

    public static String getCategoryQuiz7() {
        return CATEGORY_QUIZ7;
    }

    public static String getCategoryQuiz8() {
        return CATEGORY_QUIZ8;
    }

    public static String getCategoryQuiz9() {
        return CATEGORY_QUIZ9;
    }

    public static String getCategoryQuiz10() {
        return CATEGORY_QUIZ10;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Questions(String question, String option1, String option2, String option3, String option4, String option5, int answerNr, String category) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.answerNr = answerNr;
        this.category = category;
    }
}
