package models;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Guest on 8/2/17.
 */

public class Game {

    public String answerWord;
    public String lettersGuessed;

//    private String gameWord;
//    private char[] gameWordAsArray;
//    private String wordInProgress;

    public Game(String answerWord) {
        this.answerWord = answerWord;
        this.lettersGuessed = "";
    }

    public String addGuess(String aLetter) {
        this.lettersGuessed = lettersGuessed.concat(aLetter);
        return this.lettersGuessed;
    }

    public String getGuess() {
        return lettersGuessed;
    }

    public String selectWord(int randIndex) {
        String[] gameWords = {"cake", "java"};
        return gameWords[randIndex];
    }
//    public Game(String input) {
//        gameWord = input;
//        wordAsDashes = gameWord.replace("[a-zA-z","*");
//
//        gameWordAsArray = gameWord.toCharArray();
//
//
//
//        wordInProgress = gameWordAsArray.toString();
//
//    }
}
