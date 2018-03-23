package com.alphabetnumber.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversionValidator {

    public boolean checkStringConversionEligibility(String value){

        return !findNumbersMoreThanTwentySix(value) && !findNumbersWithTheeDigitsOrMore(value);
    }

    private boolean findNumbersMoreThanTwentySix(String value){

        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(".*[3-9]\\d|2[7-9].*");

        matcher = pattern.matcher(value);

        return matcher.find();
    }

    private boolean findNumbersWithTheeDigitsOrMore(String value){

        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(".*\\d\\d\\d.*");
        matcher = pattern.matcher(value);

        return matcher.find();
    }

    public Boolean checkIfCharacterIsNumber(Character value){
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile("[0-9]");
        matcher = pattern.matcher(value.toString());
        return matcher.find();
    }
}
