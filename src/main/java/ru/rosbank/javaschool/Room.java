package ru.rosbank.javaschool;

public class Room {

    private int length;
    private int width;
    private int height;

    public Room(double length, double width, double height) {
        this.length = (int)(length * MagicNumber.centimetersInMeter);
        this.width = (int)(width * MagicNumber.centimetersInMeter);
        this.height = (int)(height * MagicNumber.centimetersInMeter);
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }

}
