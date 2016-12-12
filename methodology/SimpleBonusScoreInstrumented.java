class SimpleBonusScoreInstrumented {
    public int score(String student_id, int student_score, int bonus_score) {
        System.out.println("[ENTER]SimpleBonusScoreInstrumented");
        ...
        if ( bonus_score > 0 ) {
            System.out.println("SimpleBonusScoreInstrumented;m:score;condition: bonus_score > 0");
            if ( student_score <= 50 ) {
                System.out.println("SimpleBonusScoreInstrumented;m:score;condition:  bonus_score > 0 | student_score <= 50");
                ...
                if ( this.quiz.getQuizScore(student_id) > 20 ) {
                    System.out.println("SimpleBonusScoreInstrumented;m:score;condition:  bonus_score > 0 | this.quiz.getQuizScore(student_id) > 20 | student_score <= 50");
                    ...
                }
                ...
            } else if ( student_score <= 70 ) {
                System.out.println("SimpleBonusScoreInstrumented;m:score;condition: bonus_score > 0 | student_score <= 70");
                ...
                if ( this.quiz.getQuizScore(student_id) < 20 ) {
                    System.out.println("SimpleBonusScoreInstrumented;m:score;condition: bonus_score > 0 | this.quiz.getQuizScore(student_id) < 20 | student_score <= 70");
                    ...
                }
                ...
            }
        }
        System.out.println("[EXIT]SimpleBonusScoreInstrumented")
        return student_score;
    }
}
