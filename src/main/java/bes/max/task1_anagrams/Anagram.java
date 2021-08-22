package bes.max.task1_anagrams;

public class Anagram {

    public String run(String input) {

        char[] letters = new char[input.length()];
        char[] notLetters = new char[input.length()];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letters[(input.length() - (i + 1))] = input.charAt(i);
            } else {
                notLetters[i] = input.charAt(i);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(letters[i])) {
                result.append(letters[i]);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (notLetters[i] == 0) {
            } else {
                result.insert(i, notLetters[i]);
            }
        }

        return result.toString();
    }

}
