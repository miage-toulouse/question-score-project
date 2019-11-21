package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by franck on 28/11/2016.
 */
public class QuestionAchoixMultipleTest {

    private QuestionAChoixMultiple questionAchoixMultiple;

    @Before
    public void setup() {
        questionAchoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
    }

    @Test
    public void testGetEnonce() {
        assertEquals("q1", questionAchoixMultiple.getEnonce());
    }

    @Test
    public void testGetScoreIndice() {
        assertEquals(33.33f, questionAchoixMultiple.getScoreForIndice(2),0.01f);
        assertEquals(0f, questionAchoixMultiple.getScoreForIndice(1),0.001f);
    }

}
