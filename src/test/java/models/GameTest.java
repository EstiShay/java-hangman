package models;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;


import static org.junit.Assert.*;

/**
 * Created by Guest on 8/2/17.
 */
public class GameTest {

    @Test
    public void Game_createsNewGame_instantiatesCorrectly() throws Exception {
        Game testGame = new Game("cake");
        assertEquals(true, testGame instanceof Game);
    }

    @Test
    public void getGuess_storeGuess_guess() throws Exception {
        Game testGame = new Game("cake");
        assertEquals("a", testGame.addGuess("a"));

    }

    @Test
    public void Game_retrieveGuess_guessLetter() throws Exception {
        Game testGame = new Game("cake");
        testGame.addGuess("a");
        assertEquals("a", testGame.getGuess());
    }
}