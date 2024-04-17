package com.student;

public class Block {
    
    private int width;
    private int length;
    private int height;

    public Block(int[] valores){
        this.width = valores[0];
        this.length = valores[1];
        this.height = valores[2];
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return (getHeight() * getLength() * getWidth());
    }

    public int getSurfaceArea() {
        return 2 * ((getHeight() * getLength()) + (getHeight() * getWidth()) + (getLength() * getWidth()));
    }
}
