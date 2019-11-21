package miagem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by franck on 28/11/2016.
 */
public class QuestionAChoixExclusifTest {

    private QuestionAChoixExclusif questionAChoixExclusif;

    @Before
    public void setup() {
        // given : une question à choix exclusif
        questionAChoixExclusif = new QuestionAChoixExclusif("q1", 2);
    }

    @Test
    public void testGetEnonce() {
        // when : on déclenche l'obtention de l'énoncé
        String enonceObtenu = questionAChoixExclusif.getEnonce();
        // then : l'énoncé correspond à celui fourni à la construction de la question
        assertEquals("q1", enonceObtenu);
    }

    @Test
    public void testGetScoreIndice() {
        // when : l'indice choisi est celui de la bonne réponse
        int indice = 2;
        // then : le score obtenu est 100
        assertEquals(100f, questionAChoixExclusif.getScoreForIndice(indice), 0.001f);
        // when : l'indice choisi n'est pas celui de la bonne réponse
        indice = 1;
        // Then : le score obtenu est 0
        assertEquals(0f, questionAChoixExclusif.getScoreForIndice(indice), 0.001f);
    }

}
