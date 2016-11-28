class SimpleBonusScore {
    public int score(int student_score, int bonus_score) {
        if ( bonus_score > 0 ) {
            if ( student_score <= 50 ) {
                student_score = Math.min(50, student_score + bonus_score);
            } else if ( student_score <= 70 ) {
                student_score = Math.min(70, student_score + bonus_score);
            }
        }
        return student_score;
    }
}
