package com.alphabetnumber;


import com.alphabetnumber.converters.StringConverter;
import com.alphabetnumber.validator.ConversionValidator;


public class AlphabetNumberConversion
{

    private final ConversionValidator validator = new ConversionValidator();
    private final StringConverter converter = new StringConverter();

    public String InvertElementsOfString(String structureToInvert){
        if(validator.checkStringConversionEligibility(structureToInvert)){
            return  converter.invertStringValues(structureToInvert);
        } else {
            return  "String not valid!";
        }
    }
}
