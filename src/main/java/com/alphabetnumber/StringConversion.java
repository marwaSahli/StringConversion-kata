package com.alphabetnumber;

import com.alphabetnumber.validator.ConversionValidator;

public class StringConversion {

    private final ConversionValidator validator = new ConversionValidator();
    private final StringConversionBuilder builder = new StringConversionBuilder();

    
    public String convert(String string) {
        if (!validator.isConvertible(string)) {
            throw new RuntimeException("String is not valid!");
        }
        return builder.buildConversion(string);
    }
}
