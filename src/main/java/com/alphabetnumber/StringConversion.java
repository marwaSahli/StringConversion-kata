package com.alphabetnumber;


import com.alphabetnumber.converters.StringConverter;
import com.alphabetnumber.validator.ConversionValidator;


public class StringConversion
{

    private final ConversionValidator validator = new ConversionValidator();
    private final StringConverter converter = new StringConverter();

    public String convert(String structureToInvert) {
        if(validator.isConvertible(structureToInvert)){
            return converter.invertStringValues(structureToInvert);
        } else {
            throw new RuntimeException("String not valid!");
        }
    }
}
