package com.alphabetnumber.converters;

import com.alphabetnumber.StringConversionUtilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberConverter implements Converter {

    public boolean canConvert(String string) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();

    }

    public String convert(String number) {
        return "" + StringConversionUtilities.alphabets[Integer.parseInt(number)-1];
    }
}
