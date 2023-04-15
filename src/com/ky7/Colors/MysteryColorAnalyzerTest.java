package com.ky7.Colors;

import com.ky7.Colors.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MysteryColorAnalyzerTest {
    @Test
    public void numberOfDistinctColorsTest(){
        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();

        ArrayList<Color> colorsList = new ArrayList<>();
        colorsList.add(Color.RED);
        colorsList.add(Color.RED);
        colorsList.add(Color.BLUE);
        colorsList.add(Color.BLUE);

        Assert.assertEquals(2, mysteryColorAnalyzer.numberOfDictinctColor(colorsList));
    }

    @Test
    public void colorOccurrenceTest(){
        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();

        ArrayList<Color> colorsList = new ArrayList<>();
        colorsList.add(Color.GREEN);
        colorsList.add(Color.GREEN);
        colorsList.add(Color.BLUE);

        Assert.assertEquals(2, mysteryColorAnalyzer.collorOcurrence(colorsList,Color.GREEN));
        Assert.assertEquals(1, mysteryColorAnalyzer.collorOcurrence(colorsList,Color.BLUE));
        Assert.assertEquals(0, mysteryColorAnalyzer.collorOcurrence(colorsList,Color.RED));
    }
}
