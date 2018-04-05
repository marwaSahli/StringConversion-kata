package com.alphabetnumber;

import com.alphabetnumber.converters.CharConverter;
import com.alphabetnumber.converters.Converter;
import com.alphabetnumber.converters.NumberConverter;

import java.util.ArrayList;
import java.util.List;

public final class StringConversionUtilities {

    public static char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static List<Converter> converters = new ArrayList<Converter>(){{
        add(new CharConverter());
        add(new NumberConverter());
    }};
}
