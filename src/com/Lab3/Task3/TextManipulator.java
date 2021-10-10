package com.Lab3.Task3;

import java.util.*;

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

    public List popularWords() {
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

        List<HashMap.Entry<String, Integer>> list = new LinkedList<>();
        for(HashMap.Entry<String, Integer> entry : m.entrySet()) {
            list.add(entry);
        }

        //comparator to sort in decreasing order

        Collections.sort(list, new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                String word1 = o1.getKey();
                int freq1 = o1.getValue();
                String word2 = o2.getKey();
                int freq2 = o2.getValue();

                if(freq1 != freq2)
                    return freq2 - freq1;
                else return word1.compareTo(word2);
            }
        });

        List<String> ans = new LinkedList<>();
        for(int i = 0; i < 5; i++)
            ans.add(list.get(i).getKey());

        return ans;
    }
}