package com.Lab3.Task1;

public class TextManipulator {
    private String s;
    public TextManipulator(String text) {
        this.s = text;
    }

    public void setText(String s) {
        this.s = s;
    }

    public String getText() {
        return s;
    }

    private String[] splitString() {
        String[] words = s.split("\\s+");

        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            words[i] = words[i].replace(",", "");
            words[i] = words[i].replace(".", "");
        }

        return words;
    }

    public int showWords() {
        return splitString().length;
    }

    public int numberSentences() {
        int sentences = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {
                sentences++;
            }
        }

        return sentences;
    }
}
