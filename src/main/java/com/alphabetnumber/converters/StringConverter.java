package com.alphabetnumber.converters;

import com.alphabetnumber.validator.ConversionValidator;

public class StringConverter {


    public final CharToNumberConverter charConverter = new CharToNumberConverter();
    public final NumberToCharConverter numberConverter = new NumberToCharConverter();
    public final ConversionValidator validator = new ConversionValidator();

    public String invertStringValues(String value){

        String result = "";
        char previousNumericValue = ' ';
       for(char character :value.toCharArray()){
           if(!validator.checkIfCharacterIsNumber(character)){
               result += charConverter.convertChartToNumber(character);
           } else {
               if(previousNumericValue != ' '){
                   result = removeLastCharCreatedFromString(result);
                   result += constructAndConvertNumber(previousNumericValue, character);
                   previousNumericValue = ' ';
               } else{
                   result += numberConverter.convertNumberToChar(Integer.parseInt(String.valueOf(character)));
                   previousNumericValue = character;
               }
           }
       }

        return result;
    }


    private String removeLastCharCreatedFromString(String value) {
        return value.substring(0, value.length() - 1);
    }

    private char constructAndConvertNumber(char previousNumericValue, char actualNumericValue){

        char result = numberConverter.convertNumberToChar(Integer.parseInt(new StringBuilder().
                append(previousNumericValue).append(actualNumericValue).toString()));

        return result;
    }

}
