package com.ky7.Colors;

import java.util.List;

/**
 * Create the implementation for the interface below. The implementation needs to be called "MysteryColorAnalyzerImpl".
 *
 * Color has the following enum structure, but hey you really don't need to know all these colors if you're implementing the methods properly.
 */

public interface MysteryColorAnalyzer {
    int numberOfDictinctColor(List<Color> mysteryColors);
    int collorOcurrence(List<Color> mysteryColors, Color color);
}
