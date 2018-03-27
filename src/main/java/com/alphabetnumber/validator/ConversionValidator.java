package com.alphabetnumber.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversionValidator {

    public boolean isConvertible(String value){
        return !isGreaterThan26(value) && !containsThreeDigitsOrMore(value);
    }

    private boolean isGreaterThan26(String value){
        Pattern  pattern = Pattern.compile(".*[3-9]\\d|2[7-9].*");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

    private boolean containsThreeDigitsOrMore(String value){
        Pattern pattern = Pattern.compile(".*\\d\\d\\d.*");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

    public boolean isNumber(Character value){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(value.toString());
        return matcher.find();
    }
}
