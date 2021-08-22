package bes.max.task1_anagrams;

import java.util.Scanner;

public class DefaultConsole implements Console {

    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void print(String text) {
        System.out.println(text);
    }

}
