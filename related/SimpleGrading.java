class SimpleGrading {
    protected SimpleBonusScore bonusScore;
    public static final String GRADE_LETTER_UNSATISFIED = "U";
    public static final String GRADE_LETTER_SATISFIED   = "S";
    public static final String GRADE_LETTER_INCOMPLETE  = "I";
    public SimpleGrading(SimpleBonusScore bonusScore) {
        this.bonusScore = bonusScore;
    }
    public String grading(int student_score, int bonus_score) {
        String grade_letter = "";
        student_score = this.bonusScore.score(student_score, bonus_score);
        if (student_score < 80) {
            grade_letter = SimpleGrading.GRADE_LETTER_UNSATISFIED;
        } else if (student_score == 0) {
            grade_letter = SimpleGrading.GRADE_LETTER_UNSATISFIED;
        } else if (student_score == 100) {
            grade_letter = SimpleGrading.GRADE_LETTER_UNSATISFIED;
        }
        return grade_letter;
    }
}
