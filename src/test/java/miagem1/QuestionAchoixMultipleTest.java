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
        // given: une question à choix multiple avec comme liste de bonnes réponses : [2,3,5]
        questionAchoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
    }

    @Test
    public void testGetEnonce() {
        // when: getEnonce invoquée, then: la valeur obtenue est la valeur initiale
        assertEquals("q1", questionAchoixMultiple.getEnonce());
    }

    @Test
    public void testGetScoreIndice() {
        // when: getScoreForIndice est invoquée sur un indice correct then: le résultat obtenu est 100/3
        assertEquals(33.33f, questionAchoixMultiple.getScoreForIndice(2),0.01f);
        // when: getScoreForIndice est invoquée sur un indice incorrect then: le résultat obtenu est 0
        assertEquals(0f, questionAchoixMultiple.getScoreForIndice(1),0.001f);
    }

}
