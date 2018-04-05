package com.alphabetnumber.converters;

import com.alphabetnumber.StringConversionUtilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharConverter implements Converter {

    public boolean canConvert(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public String convert(String character) {
        return "" + (new String(StringConversionUtilities.alphabets).indexOf(character)+1);
    }

}
