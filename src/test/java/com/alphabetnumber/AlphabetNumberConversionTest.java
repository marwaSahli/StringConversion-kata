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
    private AlphabetNumberConversion anc;

    @Before
    public void setup(){
        anc = new AlphabetNumberConversion();

    }

    @Test
    @Parameters({"1,a",
            "2,b",
            "26,z"})
    public void should_return_number_inverted_to_character(String stringToInvert, String result){
        assertThat(anc.InvertElementsOfString(stringToInvert)).isEqualTo(result);
    }

    @Test
    @Parameters({
            "x252v,String not valid!",
                "dfr98i,String not valid!"})
    public void should_test_if_numbers_representing_letters_are_separated_by_letters(String stringToInvert, String result){
            assertThat(anc.InvertElementsOfString(stringToInvert)).isEqualTo(result);
    }

}
