package com;

/**
 * Hello world!
 *
 */
public class AlphabetNumberConversion
{

    public int convertCharToNumber(char character) {
       switch (character){
           case 'a':
               return 1;
           case 'b':
               return 2;
           case 'z':
               return 26;
           default:
               return -1;

       }
    }

}
