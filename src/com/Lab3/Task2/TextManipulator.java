package com.Lab3.Task2;

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

    public int showLetters() {
        String[] words = splitString();
        int len = 0;
        for(int i = 0; i < words.length; i++)
            len += words[i].length();

        return len;
    }

    public int showConsonants() {
        return showLetters() - showVowels();
    }

    private boolean isVowel(char vowel) {
        return vowel == 'i' || vowel == 'a' || vowel == 'u' || vowel == 'e' || vowel == 'o';
    }

    public int showVowels() {
        String[] words = splitString();
        int len = 0;
        for(int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (isVowel(words[i].charAt(j))) {
                    len++;
                }
            }
        }

        return len;
    }
}
