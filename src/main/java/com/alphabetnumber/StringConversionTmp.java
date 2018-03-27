package com.alphabetnumber;


import com.alphabetnumber.converters.CharConverter;
import com.alphabetnumber.converters.NumberConverter;
import com.alphabetnumber.validator.ConversionValidator;


public class StringConversionTmp
{

    private final ConversionValidator validator = new ConversionValidator();
    public final CharConverter charConverter = new CharConverter();
    public final NumberConverter numberConverter = new NumberConverter();

    public String convert(String string) {
        if (!validator.isConvertible(string)) {
            throw new RuntimeException("String is not valid!");
        }

        String result = "";
        char previousNumericValue = ' ';
        for (char character : string.toCharArray()) {
            if (!validator.isNumber(character)) {
                result += charConverter.convert(character);
            } else {
                if (previousNumericValue != ' ') {
                    result = removeLastCharCreatedFromString(result);
                    result += constructAndConvertNumber(previousNumericValue, character);
                    previousNumericValue = ' ';
                } else {
                    result += numberConverter.convert("" + character);
                    previousNumericValue = character;
                }
            }
        }

        return result;
    }

    private String removeLastCharCreatedFromString(String value) {
        return value.substring(0, value.length() - 1);
    }

    private String constructAndConvertNumber(char previousNumericValue, char actualNumericValue) {
        return numberConverter.convert("" + previousNumericValue + actualNumericValue);
    }
}
