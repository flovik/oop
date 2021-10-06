package com.Lab3.Task1;

public class TextManipulator {
    public void showWords(String s) {
        int words = 0;
        boolean non_letter_sequence = false;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) < 65 || (s.charAt(i) > 90 && s.charAt(i) < 97) || s.charAt(i) > 122) && non_letter_sequence == false) {
                words++;
                non_letter_sequence = true;
            }

            if((s.charAt(i) > 64 && s.charAt(i) < 91) || (s.charAt(i) > 96 && s.charAt(i) < 123)) {
                non_letter_sequence = false;
            }
        }

        System.out.println("Words: " + words);
    }

    public void numberSentences(String s) {
        int sentences = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {
                sentences++;
            }
        }

        System.out.println("Sentences: " + sentences);
    }
}
