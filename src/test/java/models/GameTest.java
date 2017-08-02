package models;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


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
    public void addGuess_retrieveGuess_guessLetter() throws Exception {
        Game testGame = new Game("cake");
        testGame.addGuess("a");
        assertEquals("a", testGame.getGuess());
    }

    @Test
    public void selectWord_selectAnswerFromArray_aWord() throws Exception {
        String [] ourWords = {"cake", "java"};
        int index = 1;
        Game testGame = new Game(ourWords[index]);
        assertEquals("java", testGame.selectWord(index));
    }

//    @Test
//    public void randomWord_randomOutput_randomWordOutput() throws Exception {
//        Game testGame = new Game(String stringInput);
//        String expectedOutput = randomWordOutput;
//        assertEquals(expectedOutput, randomGen.randomWord(stringInput) )
//    }



}