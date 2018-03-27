package com.alphabetnumber.converters;

import com.alphabetnumber.Utilities;

public class NumberToCharConverter {

    public String convert(String number) {
        return "" + Utilities.alphabets[Integer.parseInt(number)-1];
    }
}
