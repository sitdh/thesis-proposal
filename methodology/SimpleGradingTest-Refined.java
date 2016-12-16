public class SimpleGradingTest {
    @Test
    public void testSimpleGrading() {
        SimpleGrading g = new SimpleGrading(new SimpleBonusScore());
        String grade_letter = g.grading("5873000021", 75, 0);

        assertEquals("U", grade_letter);
    }

}
