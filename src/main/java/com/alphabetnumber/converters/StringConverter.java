package com.alphabetnumber.converters;

import com.alphabetnumber.validator.ConversionValidator;

public class StringConverter {


    public final CharToNumberConverter charConverter = new CharToNumberConverter();
    public final NumberToCharConverter numberConverter = new NumberToCharConverter();
    public final ConversionValidator validator = new ConversionValidator();

    public String invertStringValues(String value){

        String result = "";
        Character previousNumericValue = null;
       for(char character :value.toCharArray()){
           if(!validator.checkIfCharacterIsNumber(character)){
               result += charConverter.convertChartToNumber(character);
           } else {
               if(previousNumericValue != null){
                   result = removeLastCharCreatedFromString(result);
                   result += numberConverter.convertNumberToChar(Integer.parseInt(new StringBuilder().
                           append(previousNumericValue).append(character).toString()));
                   previousNumericValue = null;
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
}
