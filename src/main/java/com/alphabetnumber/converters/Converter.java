package com.alphabetnumber.converters;

public interface Converter {

    boolean canConvert(String string);
    String convert(String string);
}
