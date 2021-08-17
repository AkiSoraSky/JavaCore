package Practise;

import java.util.Scanner;

public class WordCount {
    public int count(String sentence){
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String sentence = sc.nextLine();
        WordCount wc = new WordCount();
        int count = wc.count(sentence);
        System.out.println("Total words in count: "+count);
    }
}
