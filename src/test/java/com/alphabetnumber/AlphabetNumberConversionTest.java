package com.alphabetnumber;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class AlphabetNumberConversionTest
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
    public void should_convert_number_inverted_to_character(String stringToInvert, String result){
        assertThat(stringConversion.convert(stringToInvert)).isEqualTo(result);
    }

    @Test
    @Parameters({
            "x252v,String not valid!",
                "dfr98i,String not valid!"})
    public void should_test_if_numbers_representing_letters_are_separated_by_letters(String stringToInvert, String result){
            assertThat(stringConversion.convert(stringToInvert)).isEqualTo(result);
    }

}
