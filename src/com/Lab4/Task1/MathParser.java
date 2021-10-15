package com.Lab4.Task1;
import java.util.ArrayDeque;
import java.util.Deque;

public class MathParser {
    public boolean isCorrect(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < input.length(); i++){
            if(stack.isEmpty()) {
                if (input.charAt(i) == '(' || input.charAt(i) == ')') stack.push(input.charAt(i));
            }
            else {
                if(input.charAt(i) == '(') stack.push(input.charAt(i));
                else if(input.charAt(i) == ')') {
                    if(stack.peek() == '(') stack.pop();
                    else stack.push(input.charAt(i));
                }
            }

        }

        return stack.isEmpty();
    }
}
