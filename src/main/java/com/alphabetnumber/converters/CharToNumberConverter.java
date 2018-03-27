package com.alphabetnumber.converters;

import com.alphabetnumber.Utilities;

public class CharToNumberConverter {

    public String convert(char character) {
        return "" + (new String(Utilities.alphabets).indexOf(character)+1);
    }

}
