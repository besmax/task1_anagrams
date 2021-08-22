package bes.max.task1_anagrams;

public class Main {    

    public static void main(String args[]) {
        
        Anagram anagram = new Anagram();
        Console console = new DefaultConsole();
        String result;

        while (true) {
            String input = console.read();
            result = anagram.run(input);
            console.print(result);
        }
        
    }

}
