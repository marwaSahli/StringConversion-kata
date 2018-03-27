package com.alphabetnumber.converters;

import com.alphabetnumber.Utilities;

public class CharConverter implements Converter {

    public String convert(String character) {
        return "" + (new String(Utilities.alphabets).indexOf(character)+1);
    }

}
