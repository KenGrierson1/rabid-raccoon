package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<String> matchSubstring(String substring, String... candidates) { // PAPS - note use of ellipses
        List<String> matches = new ArrayList<>();

        String substringLower = substring.toLowerCase();

        for (String candidate : candidates) {
            String candidateLower = candidate.toLowerCase();
            if (candidateLower.contains(substringLower)) {
                matches.add(candidate);
            }
        }

        return matches;
    }

    public static List<String> matchSubstringFun(String substring, String... candidates) {

        return null;
    }

    public static void main(String[] args) {

        String substring = args[0];
        // I looked up this line because f*ck Java
        String[] candidates = Arrays.stream(args, 1, args.length).toArray(String[]::new);

        List<String> matches = matchSubstring(substring, candidates);

        System.out.println("Successful candidates:");
        for (String match : matches) {
            System.out.println(match);
        }
    }

}
