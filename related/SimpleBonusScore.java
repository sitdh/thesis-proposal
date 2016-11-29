class SimpleBonusScore {
    public SimpleBonusScore(SimpleQuiz quiz) {
        this.quiz = quiz;
    }
    public int score(String student_id, int student_score, int bonus_score) {
        int maxinumScore = 0;
        String quizSum = this.quiz.getQuizSum(student_id);
        if ( bonus_score > 0 ) {
            if ( student_score <= 50 ) {
                maximumScore = 50;
                if ( this.quiz.getQuizScore(student_id) < 20 ) {
                    maxinumScore = 50;
                }
                student_score = Math.min(maxinumExtraScore, student_score + bonus_score);
            } else if ( student_score <= 70 ) {
                maximumScore = 75;
                if ( this.quiz.getQuizScore(student_id) < 20 ) {
                    maxinumScore = 70;
                }
                student_score = Math.min(maxinumScore, student_score + bonus_score);
            }
        }

        return student_score;
    }
}
