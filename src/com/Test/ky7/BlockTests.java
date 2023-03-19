package com.Test.ky7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.ky7.Block;

import java.util.Random;

public class BlockTests {
    @Test
    public void testBasicBlock() throws Exception {
        Block b = new Block(new int[]{2,2,2});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
    }

    @Test
    public void testBasicBlock2() throws Exception {
        Block b = new Block(new int[]{2,4,6});
        assertEquals(2,b.getWidth());
        assertEquals(4,b.getLength());
        assertEquals(6,b.getHeight());
        assertEquals(48,b.getVolume());
        assertEquals(88,b.getSurfaceArea());
    }


    @Test
    public void testBasicBlock3() throws Exception {

        Random rnd = new Random();

        int[] rndint =
                new int[] {rnd.nextInt(10),rnd.nextInt(10),rnd.nextInt(10)};
        Block b = new Block(rndint);
        int width = rndint[0];
        int length = rndint[1];
        int height = rndint[2];
        assertEquals(rndint[0],b.getWidth());
        assertEquals(rndint[1],b.getLength());
        assertEquals(rndint[2],b.getHeight());
        assertEquals(width * length * height,b.getVolume());
        assertEquals(2*(width * length + width * height + length * height),b.getSurfaceArea());
    }
}
