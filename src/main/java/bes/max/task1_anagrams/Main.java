package bes.max.task1_anagrams;

public class Main {

    private Anagram anagram = new Anagram();
    private Console console = new DefaultConsole();

    public Main(Anagram anagram, Console console) {
        this.anagram = anagram;
        this.console = console;
    }

    void run() {
        String result;
        console.print("Enter text for reverse or enter 'q' for quit");

        while (true) {
            String input = console.read();

            if (input.equals("q")) {
                return;
            }

            result = anagram.run(input);
            console.print(result);
        }

    }

    public static void main(String args[]) {
        Main main = new Main(new Anagram(), new DefaultConsole());
        main.run();
    }

}
