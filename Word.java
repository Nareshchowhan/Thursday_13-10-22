
// finding the longest word in file
package com.Longestword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Word {
    public static void main(String [ ] args) throws FileNotFoundException {
             new Word().findLongestWords();
        }

    public String findLongestWords() throws FileNotFoundException {

      String longest_word = "";
      String current;
      Scanner sc = new Scanner(new File("desktop/test.txt"));


      while (sc.hasNext()) {
         current = sc.next();
          if (current.length() > longest_word.length()) {
            longest_word = current;
          }

      }
        System.out.println("\n"+longest_word+"\n");
           return longest_word;
           }
}