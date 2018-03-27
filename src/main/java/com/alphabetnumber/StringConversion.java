package com.alphabetnumber;


import com.alphabetnumber.converters.StringConverter;
import com.alphabetnumber.validator.ConversionValidator;


public class StringConversion
{

    private final ConversionValidator validator = new ConversionValidator();
    private final StringConverter converter = new StringConverter();

    public String convert(String string) {
        if (!validator.isConvertible(string)) {
            throw new RuntimeException("String is not valid!");
        }

        return converter.invertStringValues(string);
    }
}
