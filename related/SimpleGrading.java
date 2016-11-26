class SimpleGrading {
    protected SimpleBonusScore bonusScore;
    public SimpleGrading(SimpleBonusScore bonusScore) {
        this.bonusScore = bonusScore;
    }
    public String grading(int student_score, int bonus_score) {
        String grade_letter = "";
        student_score = this.bonusScore.score(student_score, bonus_score);
        if (student_score < 80) {
            grade_letter = "U";
        } else if (student_score == 0) {
            grade_letter = "I";
        } else if (student_score == 100) {
            grade_letter = "S";
        }
        return grade_letter;
    }
}
