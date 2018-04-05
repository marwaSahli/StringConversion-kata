package com.alphabetnumber;

import com.alphabetnumber.converters.Converter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class StringConversionBuilder {

    private List<Converter> converters;

    public StringConversionBuilder() {

        this.converters = StringConversionUtilities.converters;
    }

    private Iterable<String> cutStringIntoBlocks(String string) {

        List<String> blocks = new ArrayList<String>();
        char[] characters = string.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            if (isLetter(character)) {
                blocks.add(String.valueOf(character));
            } else if (character == '1' || character == '2') {
                if (i == characters.length - 1) {
                    blocks.add(String.valueOf(character));
                    continue;
                }
                char nextChar = characters[i + 1];
                if (isLetter(nextChar)) {
                    blocks.add(String.valueOf(character));
                } else if (isDigit(nextChar)) {
                    blocks.add(String.valueOf(character) + nextChar);
                    i++;
                }
            } else if (isDigit(character) && parseInt("" + character) >= 3) {
                blocks.add(String.valueOf(character));
            } else if (isDigit(character) && parseInt("" + character) == 0) {
                // ?
                blocks.add("" +character);

            }else {
                blocks.add("" +character);
            }
        }
        return blocks;
    }

    private boolean isDigit(char character) {
        return Character.isDigit(character);
    }

    private boolean isLetter(char character) {
        return Character.isLetter(character);
    }

    private String convertBlocks(Iterable<String> blocks){

        String result = "";
        for(String block :blocks){
             result += convertBlock(block);
        }
        return result;
    }

    private String convertBlock(String block){

        for(Converter converter:converters){
            if(converter.canConvert(block)){
                return converter.convert(block);
            }
        }
        return "0";
    }

    public String buildConversion(String string){

        Iterable<String> blocks = cutStringIntoBlocks(string);
        return convertBlocks(blocks);
    }
}
