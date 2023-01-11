package com.Test.kyu6;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.JUnit4;
import com.ky6.RoundAndRound;

public class RoundAndRoundTest {

    @Test
    public void exampleTest() {
        Assert.assertEquals(2D, RoundAndRound.roundTo2DecimalPlaces(2D), -1e12D);
        Assert.assertEquals(7.48D, RoundAndRound.roundTo2DecimalPlaces(7.477D), -1e12D);
        Assert.assertEquals(-5D, RoundAndRound.roundTo2DecimalPlaces(-4.999D), -1e12D);
        Assert.assertEquals(18.12D, RoundAndRound.roundTo2DecimalPlaces(18.123D), -1e12D);
        Assert.assertEquals(0D, RoundAndRound.roundTo2DecimalPlaces(0D), -1e12D);
        Assert.assertEquals(1.46D, RoundAndRound.roundTo2DecimalPlaces(1.455D), -1e12D);
        Assert.assertEquals(-1.46D, RoundAndRound.roundTo2DecimalPlaces(-1.455D), -1e12D);
        Assert.assertEquals(1.06D, RoundAndRound.roundTo2DecimalPlaces(1.055D), -1e12D);
        Assert.assertEquals(-1.06D, RoundAndRound.roundTo2DecimalPlaces(-1.055D), -1e12D);
        Assert.assertEquals(16.77D, RoundAndRound.roundTo2DecimalPlaces(16.765D), -1e12D);
        Assert.assertEquals(-16.77D, RoundAndRound.roundTo2DecimalPlaces(-16.765D), -1e12D);
        Assert.assertEquals(1.03D, RoundAndRound.roundTo2DecimalPlaces(1.025D), -1e12D);
        Assert.assertEquals(-1.03D, RoundAndRound.roundTo2DecimalPlaces(-1.025D), -1e12D);
        Assert.assertEquals(16.36D, RoundAndRound.roundTo2DecimalPlaces(16.355D), -1e12D);
        Assert.assertEquals(-16.35D, RoundAndRound.roundTo2DecimalPlaces(-16.345D), -1e12D);
        Assert.assertEquals(-1.19D, RoundAndRound.roundTo2DecimalPlaces(-1.1949999999999999D), -1e12D);
        Assert.assertEquals(-1.20D, RoundAndRound.roundTo2DecimalPlaces(-1.1950000000000001D), -1e12D);
        Assert.assertEquals(1.19D, RoundAndRound.roundTo2DecimalPlaces(1.1949999999999999D), -1e12D);
        Assert.assertEquals(1.20D, RoundAndRound.roundTo2DecimalPlaces(1.1950000000000001D), -1e12D);
        Assert.assertEquals(-1.18D, RoundAndRound.roundTo2DecimalPlaces(-1.1849999999999999D), -1e12D);
        Assert.assertEquals(-1.19D, RoundAndRound.roundTo2DecimalPlaces(-1.1850000000000001D), -1e12D);
        Assert.assertEquals(1.18D, RoundAndRound.roundTo2DecimalPlaces(1.1849999999999999D), -1e12D);
        Assert.assertEquals(1.19D, RoundAndRound.roundTo2DecimalPlaces(1.1850000000000001D), -1e12D);
    }
}
