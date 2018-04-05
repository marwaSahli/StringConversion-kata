package com.alphabetnumber;


import com.alphabetnumber.converters.CharConverter;
import com.alphabetnumber.converters.Converter;
import com.alphabetnumber.converters.NumberConverter;
import com.alphabetnumber.validator.ConversionValidator;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;


public class StringConversion {

    private final ConversionValidator validator = new ConversionValidator();
    private final StringConversionBuilder builder = new StringConversionBuilder();

    public StringConversion() {

    }

    public String convert(String string) {
        if (!validator.isConvertible(string)) {
            throw new RuntimeException("String is not valid!");
        }

        return builder.buildConverson(string);



    }


}
