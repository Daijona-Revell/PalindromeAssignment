package com.codeintelx.bank;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String wordFromUser = scanner.next();
        //System.out.println((wordFromUser.charAt(wordFromUser.length() - 1)));
        isPalindrome(wordFromUser);


    }

    public static String isPalindrome(String wordFromUser) {
        List<Character> backwardsLetterCount = new ArrayList<>();
        List<Character> forwardLetterCount = new ArrayList<>();


        while (wordFromUser != null)

        {
            String firstWord = null;
            String secondWord = null;


            //forwardLetterCount.add(wordFromUser);
            //System.out.println(forwardLetterCount);

            for (int i = 0; i < wordFromUser.length(); i++) {
                char firstLetter = wordFromUser.charAt(i);
                forwardLetterCount.add(firstLetter);
                //System.out.println(forwardLetterCount);
            }

            for (int i = 1; i < wordFromUser.length() + 1; i++) {
                char lastLetter = wordFromUser.charAt(wordFromUser.length() - i);
                backwardsLetterCount.add(lastLetter);
                //System.out.println(lastLetter);
                //System.out.println(characterWords);

            }

            for (int i = 0; i < forwardLetterCount.size(); i++) {
                firstWord = String.valueOf(forwardLetterCount.toString());
                System.out.println(firstWord);
                break;
            }

            for (int i = 0; i < backwardsLetterCount.size(); i++) {
                secondWord = String.valueOf(backwardsLetterCount.toString());
                System.out.println(secondWord);
                break;
            }
            if (firstWord.contains(secondWord)) {
                System.out.println("Pallindrome");
                ;
                break;
            } else if (!firstWord.contains(secondWord)) {
                System.out.println("Not a Palindrome");
                break;
            }


//        if (wordFromUser == secondWord)
//        {
//            return "Palindrome";
//        }
//        else
//            return "Not a palindrome";

        }

        return wordFromUser;
    }
}































//        while(wordFromUser!=null)
//        {
////            int index = 1;
////            char lastLetter = wordFromUser.charAt(wordFromUser.length() - index);
////            characterWords.add(lastLetter);
////            index ++;
////            System.out.println(lastLetter);
//
//
//            for (int i = 0; i < wordFromUser.length(); i++)
//            {
//                char c = wordFromUser.charAt(wordFromUser.length()-1);
//                System.out.println(characterWords.get(i));
//            }
//                //System.out.println(characterWords.get(i));
////            }
//        }
//




        //char reverse = wordFromUser.charAt(0);
        //System.out.println(lastLetter);
        //System.out.println(reverse);

//        while(wordFromUser!=null)
//        {
//            char lastLetter = wordFromUser.charAt(wordFromUser.length()-1);
//            char reverse = wordFromUser.charAt(0);
//            System.out.println(lastLetter + reverse);
//        }






















////        char reverse;
//        String secondWordFromUser = wordFromUser;
////        char lastLetter;
//
//        while (wordFromUser != null)
//        {
//
////            char lastLetter = wordFromUser.charAt(wordFromUser.length()-1);
////            characterWords.add(lastLetter);
////            //wordFromUser.length()-1;
////            System.out.println(lastLetter);
//
////            for(char c =0; c < wordFromUser.length(); c++)
////            {
////                characterWords.add(lastLetter);
////                System.out.println(characterWords);
////            }
//
////                    //= number%10;
//            char reverse = (wordFromUser.charAt(0));
//
//            //String word = reverse  + "+" + lastLetter;
////            number/=10;
//           // System.out.println(word);
////        }
////        if(reverse == secondNumber)
////        {
////            return true;
////        }
////        else
////        {
////            return false;
       // }
        //return null;
//    }
//}
