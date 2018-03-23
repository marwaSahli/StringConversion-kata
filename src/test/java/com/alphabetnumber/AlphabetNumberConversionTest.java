package com.alphabetnumber;

import com.alphabetnumber.AlphabetNumberConversion;
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
    @Parameters({"a,1",
            "b,2",
            "z,26"})
    public void should_return_character_inverted_to_number(char character, int number){
        assertThat(anc.convertCharToNumber(character)).isEqualTo(number);

    }
}
