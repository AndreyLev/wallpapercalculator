package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.Room;
import ru.rosbank.javaschool.Wallpaper;

public class RoomService {

    public int calculatePerimeter(Room room)
    {
        int perimeter = (room.getLength() + room.getWidth()) * 2;
        return perimeter;
    }

    public int countTheNumberOfPanelsForGluing(Room room, Wallpaper wallpaper)
    {
        int numberOfPanels = (int)Math.ceil((double)(calculatePerimeter(room)) / wallpaper.getWidth());
        return numberOfPanels;
    }

    public int countTheNumberPanelsFromOneRoll(Room room, Wallpaper wallpaper)
    {
        int numberOfPanels = 0;
        int panelLength;
        int mastersRecommendation = 10;

        if (wallpaper.getRapport() == Wallpaper.freeDocking) {

            panelLength = room.getHeight() + mastersRecommendation;
            numberOfPanels = (int)Math.floor((double)(wallpaper.getLengthOfOneRoll()) / panelLength);
            return numberOfPanels;

        }

        if (wallpaper.getRapport() == Wallpaper.directDocking) {

            panelLength = room.getHeight() + mastersRecommendation + Wallpaper.directDocking;
            numberOfPanels = (int)Math.floor((double)(wallpaper.getLengthOfOneRoll()) / panelLength);
            return numberOfPanels;

        }

        if (wallpaper.getRapport() == Wallpaper.offsetDocking) {
            int separator = 100;
            int repeatPatternDistance = Wallpaper.offsetDocking / separator;
            int stripOffset = Wallpaper.offsetDocking % separator;
            panelLength = room.getHeight() + mastersRecommendation + repeatPatternDistance + stripOffset;
            numberOfPanels = (int)Math.floor((double)(wallpaper.getLengthOfOneRoll()) / panelLength);
            return numberOfPanels;

        }

        return numberOfPanels;
    }

    public int countTheNumberOfRolls(Room room, Wallpaper wallpaper)
    {
        int numberOfRolls = (int)Math.ceil((double)(countTheNumberOfPanelsForGluing(room, wallpaper)) / countTheNumberPanelsFromOneRoll(room, wallpaper));
        return numberOfRolls;
    }

}
