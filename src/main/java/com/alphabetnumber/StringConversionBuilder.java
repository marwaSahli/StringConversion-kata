package com.alphabetnumber;

import com.alphabetnumber.converters.CharConverter;
import com.alphabetnumber.converters.Converter;
import com.alphabetnumber.converters.NumberConverter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class StringConversionBuilder {

    private List<Converter> converters;

    public StringConversionBuilder() {

        this.converters = StringConversionUtilities.converters;
    }

    private Iterable<String> cutIntoBlocks(String string) {

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
        boolean converted = false;
        for(String block :blocks){
            for(Converter converter:converters){
                if(converter.canConvert(block)){
                    result += converter.convert(block);
                    converted = true;
                    break;
                }
            }
            if(!converted)
                result += "0";
            else
                converted = false;
        }
        return result;
    }

    public String buildConversion(String string){

        Iterable<String> blocks = cutIntoBlocks(string);
        return convertBlocks(blocks);
    }
}
