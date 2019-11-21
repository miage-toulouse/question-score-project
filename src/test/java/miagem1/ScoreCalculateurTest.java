package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by franck on 28/11/2016.
 */
public class ScoreCalculateurTest {

    private QuestionAChoixMultiple questionAchoixMultiple;
    private ScoreCalculateur scoreCalculateur;

    @Before
    public void setUp() throws Exception {
        questionAchoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
        scoreCalculateur = new ScoreCalculateur();
    }

    @Test
    public void testCalculeScore() throws Exception {
        // given : une liste de réponses fausses
        List<Integer> lf = new ArrayList<Integer>(Arrays.asList(1,4));
        // expected : le score vaut zéro
        assertEquals(0f, scoreCalculateur.calculeScore(lf,questionAchoixMultiple),0.01f);

        // given : une liste de réponses à moitié correcte
        List<Integer> ltf = new ArrayList<Integer>(Arrays.asList(2,3));
        // expected : le score vaut 2/3 du max
        assertEquals(66.66f, scoreCalculateur.calculeScore(ltf,questionAchoixMultiple),0.01f);

        // given : une liste de réponses entièrement correcte
        List<Integer> lt = new ArrayList<Integer>(Arrays.asList(2,3,5));
        // expected : le score vaut zéro
        assertEquals(100f, scoreCalculateur.calculeScore(lt,questionAchoixMultiple),0.01f);

    }

}
