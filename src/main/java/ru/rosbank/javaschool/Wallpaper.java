package ru.rosbank.javaschool;

public class Wallpaper {

    public final static int freeDocking = 0;
    public final static int directDocking = 64;
    public final static int offsetDocking = 64_32;

    private int width;
    private int lengthOfOneRoll;
    private int rapport;

    public Wallpaper(double width)
    {
        this.width = (int)(width * MagicNumber.centimetersInMeter);
        lengthOfOneRoll = 10 * MagicNumber.centimetersInMeter;
        rapport = 0;
    }

    public Wallpaper(double width, int docking)
    {
        rapport = 0;

        if (docking == freeDocking) {
            rapport = freeDocking;
        }

        if (docking == directDocking) {
            rapport = directDocking;
        }

        if (docking == offsetDocking) {
            rapport = offsetDocking;
        }

        this.width = (int)(width * MagicNumber.centimetersInMeter);
        lengthOfOneRoll = 10 * MagicNumber.centimetersInMeter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLengthOfOneRoll() {
        return lengthOfOneRoll;
    }

    public void setLengthOfOneRoll(int lengthOfOneRoll) {
        this.lengthOfOneRoll = lengthOfOneRoll;
    }

    public int getRapport() {

        return rapport;
    }

    public void setRapport(int rapport) {

        this.rapport = rapport;
    }

}
