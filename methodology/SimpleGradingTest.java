import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleGradingTest {
    @Test
    public void testSimpleGrading() {
        SimpleGrading g = new SimpleGrading(new SimpleBonusScore());
        String grade_letter = g.grading("IUUUSISS", 65, 42);

        assertEquals("lorem", grade_letter);
    }

}
