package com.Lab3.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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

    public String longestWord() {
        String[] words = splitString();
        String temp = "";
        for(int i = 0; i < words.length; i++)
            if(words[i].length() > temp.length())
                temp = words[i];

        return temp;
    }

    public ArrayList popularWords() {
        String[] words = splitString();
        HashMap<String, Integer> m = new HashMap<>();
        int popular = 0;
        for(int i = 0; i < words.length; i++) {
            if (m.containsKey(words[i])) {
                m.put(words[i], m.get(words[i]) + 1);
            } else {
                m.put(words[i], 1);
            }

            if(m.get(words[i]) > popular)
                popular = m.get(words[i]);
        }

        ArrayList<String> w = new ArrayList<>();
        while(w.size() != 5) {
            for (HashMap.Entry<String, Integer> entry : m.entrySet()) {
                if(w.size() == 5)
                    break;

                if(entry.getValue().equals(popular)) {
                    w.add(entry.getKey());
                }
            }
            popular--;
        }

        return w;
    }
}