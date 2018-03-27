package com.alphabetnumber.converters;

import com.alphabetnumber.Utilities;

public class NumberConverter implements Converter {

    public String convert(String number) {
        return "" + Utilities.alphabets[Integer.parseInt(number)-1];
    }
}
