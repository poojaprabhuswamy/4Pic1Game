package com.cmpe207.PictureGuess;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordReader {
    private static final String fileName = "/res/words.txt";

    private ArrayList<String> words = new ArrayList<String>();

    public WordReader() {
        try (InputStream in = getClass().getResourceAsStream(fileName);
                BufferedReader bf = new BufferedReader(new InputStreamReader(in))) {

            String line = "";
            while ((line = bf.readLine()) != null)
                words.add(line);
        }
        catch (Exception e) {
            System.out.println("Couldn't find/read file: " + fileName);
            System.out.println("Error message: " + e.getMessage());
        }
    }

    /*public String getRandomWord() {
        if (words.isEmpty()) return "NO-DATA";
        return words.get((int)(Math.random()*words.size()));
    }*/
    
    public String getWord(int gameNumber)
    {
    	if (words.isEmpty()) return "NO_DATA";
    	return words.get(gameNumber);    
    }
    
    /*public String checkCorrectAnswer(int gameNumber, String userInput){
    	
    	String correctAns;
    	for (int i = 0; i < words.size(); i++){
    	if (gameNumber == Integer.parseInt(words.get(i).substring(0, 1))){
    		if (userInput == words.get(i)){
    			System.out.println("Congrats! You won!");
    		}
    		else{
    			System.out.println("")
    		}
    	}
    	}
		return null;
    	
    }*/
}
