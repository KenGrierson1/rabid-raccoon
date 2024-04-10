package org.example;

import java.util.Stack;

public class StringStack extends Stack<Character> {

    private String internalString;

    public StringStack(String internalString) {
        this.internalString = internalString;
    }

    public void regenerate() {
        this.clear();
        char[] internalChars = internalString.toCharArray();
        // form string stack with characters backwards
        for (int i = internalChars.length - 1; i >= 0; i--) {
            this.push(internalChars[i]);
        }
    }

}

