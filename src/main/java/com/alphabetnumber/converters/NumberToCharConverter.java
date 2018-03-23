package com.alphabetnumber.converters;

import com.alphabetnumber.Utilities;

public class NumberToCharConverter {


    public char convertNumberToChar(int number) {
        return Utilities.alphabets[number-1];
    }
}
