package com.ky7;

class Blocks {
    int Width;
    int Height;
    int Length;

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public int getLength() {
        return Length;
    }

     int getVolume(){
        return 1;
    }

    int getSurfaceArea() {
        return 1;
    }


}
public class Block extends Blocks {

    public Block(int[] intArr) {
        this.Width = intArr[0];
        this.Length = intArr[1];
        this.Height = intArr[2];
    }

    @Override
    public int getVolume(){
        return this.Length * this.Height * this.Width;
    }

    @Override
   public int getSurfaceArea() {
        return 2 * ((this.Length * this.Width)
                + (this.Width * this.Height)
                + (this.Length * this.Height));
    }

}
