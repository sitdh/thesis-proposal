public class SimpleGradingTest {
    @Test
    public void testSimpleGrading() {
        SimpleGrading g = new SimpleGrading(new SimpleBonusScore());
        String grade_letter = g.grading("IUUUSISS", 75, 0);

        assertEquals("lorem", grade_letter);
    }

}
