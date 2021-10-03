package bes.max.task1_anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {
    
    private Anagram anagramForTest = new Anagram();

    @Test
    void givenWordWithLatinLettersOnlyIsReversedCorrectly() {
        assertEquals(anagramForTest.run("Congratulation"), "noitalutargnoC");
    }
    
    
    @Test
    void givenNumbersOnlyAreNotReversed() {
        assertEquals(anagramForTest.run("15693737"), "15693737");
    }
    
    @Test
    void givenWordWithLatinLettersAndOtherSymbolsIsReversedCorrectly() {
        assertEquals(anagramForTest.run("1Ma!2nbtr"), "1rt!2bnaM");
    }

}
