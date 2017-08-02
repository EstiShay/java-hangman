package models;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Guest on 8/2/17.
 */

public class Game {

    //Array gets created up here

    public String answerWords;
    public String lettersGuessed;

//    private String gameWord;
//    private char[] gameWordAsArray;
//    private String wordInProgress;

    public Game(String answerWords) {
        //answer selected from array to be an attribute here
        this.answerWords = answerWords;
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

    public int selectRandomIndex(){
        String[] gameWords = {"cake", "java"};
        Random randomGen = new Random();
        int index = randomGen.nextInt(2);
        return index;
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
