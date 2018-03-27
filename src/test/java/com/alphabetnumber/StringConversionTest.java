package com.alphabetnumber;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StringConversionTest
{
    private StringConversion stringConversion;

    @Before
    public void setup(){
        stringConversion = new StringConversion();
    }

    @Test
    @Parameters({"1,a",
            "2,b",
            "26,z"})
    public void should_convert_digits_into_character(String string, String result){
        assertThat(stringConversion.convert(string)).isEqualTo(result);
    }

    @Test
    @Parameters({"a,1",
            "b,2"})
    public void should_convert_letters_into_their_index(String stringToInvert, String result){
        assertThat(stringConversion.convert(stringToInvert)).isEqualTo(result);
    }

    @Test(expected = RuntimeException.class)
    @Parameters({
            "x252v",
                "dfr98i"})
    public void should_throw_an_error_when_number_greater_than_26_is_detected(String stringToInvert){
            stringConversion.convert(stringToInvert);
    }

}
