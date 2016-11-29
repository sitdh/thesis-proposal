class SimpleBonusScoreInstrumented {
    public int score(String student_id, int student_score, int bonus_score) {
        System.out.println("[ENTER]SimpleBonusScoreInstrumented")
        int maxinumScore = 0;
        String quizSum = this.quiz.getQuizSum(student_id);
        if ( bonus_score > 0 ) {
            System.out.println("SimpleBonusScoreInstrumented;m:score;condition: bonus_score > 0")
            if ( student_score <= 50 ) {
                System.out.println("SimpleBonusScoreInstrumented;m:score;condition:  bonus_score > 0 | student_score <= 50")
                int quizExtra = this.quiz(student_id);
                int maxinumScore = 50;
                if ( this.quiz.getQuizScore(student_id) > 20 ) {
                    System.out.println("SimpleBonusScoreInstrumented;m:score;condition:  bonus_score > 0 | this.quiz.getQuizScore(student_id) > 20 | student_score <= 50")
                    maxinumScore = 50;
                }
                student_score = Math.min(maxinumExtraScore, student_score + bonus_score);
            } else if ( student_score <= 70 ) {
                System.out.println("SimpleBonusScoreInstrumented;m:score;condition: bonus_score > 0 | student_score <= 70")
                maximumScore = 75;
                if ( this.quiz.getQuizScore(student_id) < 20 ) {
                    System.out.println("SimpleBonusScoreInstrumented;m:score;condition: bonus_score > 0 | this.quiz.getQuizScore(student_id) < 20 | student_score <= 70")
                    maxinumScore = 70;
                }
                student_score = Math.min(maximumScore, student_score + bonus_score);
            }
        }

        System.out.println("[EXIT]SimpleBonusScoreInstrumented")

        return student_score;
    }
}
