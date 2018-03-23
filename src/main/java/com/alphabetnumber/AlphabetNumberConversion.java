package com.alphabetnumber;


import com.alphabetnumber.converters.CharToNumberConverter;

/**
 * Hello world!
 *
 */
public class AlphabetNumberConversion
{

    public int convertCharToNumber(char character) {

        CharToNumberConverter ctnc = new CharToNumberConverter();
        return  ctnc.convertChartToNumber(character);
    }
}
