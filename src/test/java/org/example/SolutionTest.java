package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testMatchLowerCase() {
        List<String> result = Solution.matchSubstring("ox", "the", "quick", "brown", "fox", "jumped"); // Use of ellipses means compiler creates array foe me - ie variable argument list !
        assertEquals(List.of("fox"), result);
    }

    @Test
    public void testMatchUpperCase() {
        List<String> result = Solution.matchSubstring("ox", "THE", "QUICK", "BROWN", "FOX", "JUMPED");
        assertEquals(List.of("FOX"), result);
    }

    @Test
    public void testMatchFunLowerCase() {
        List<String> result = Solution.matchSubstringFun("ox", "the", "quick", "brown", "fox", "jumped");
        assertEquals(List.of("fox"), result);
    }

    @Test
    public void testMatchFunUpperCase() {
        List<String> result = Solution.matchSubstringFun("ox", "THE", "QUICK", "BROWN", "FOX", "JUMPED");
        assertEquals(List.of("FOX"), result);
    }
}
