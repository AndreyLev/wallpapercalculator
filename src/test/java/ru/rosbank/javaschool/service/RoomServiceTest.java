package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.Room;
import ru.rosbank.javaschool.Wallpaper;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {

    @Test
    public void shouldWallpaperCalculatorCountFreeDocking()
    {
        RoomService roomService = new RoomService();
        Room room = new Room(5,6,2.75);
        Wallpaper wallpaper = new Wallpaper(1.06);

        int result = roomService.countTheNumberOfRolls(room, wallpaper);

        assertEquals(7, result);
    }

    @Test
    public void shouldWallpaperCalculatorCountDirectDocking()
    {
        RoomService roomService = new RoomService();
        Room room = new Room(5,6,2.75);
        Wallpaper wallpaper = new Wallpaper(1.06, 64);

        int result = roomService.countTheNumberOfRolls(room, wallpaper);

        assertEquals(11, result);
    }

    @Test
    public void shouldWallpaperCalculatorCountOffsetDocking()
    {
        RoomService roomService = new RoomService();
        Room room = new Room(5,6,2.75);
        Wallpaper wallpaper = new Wallpaper(1.06, 64_32);

        int result = roomService.countTheNumberOfRolls(room, wallpaper);

        assertEquals(11, result);
    }

    @Test
    public void shouldCountTheNumberOfRollsWithNonIntegerPerimeter()
    {
        RoomService roomService = new RoomService();
        Room room = new Room(5.05,6.29,2.75);
        Wallpaper wallpaper = new Wallpaper(1.06);

        int result = roomService.countTheNumberOfRolls(room, wallpaper);

        assertEquals(8, result);
    }

    @Test
    public void countTheNumberPanelsFromOneRollWithWrongRapport() {
        RoomService roomService = new RoomService();
        Room room = new Room(5.05,6.29,2.75);
        Wallpaper wallpaper = new Wallpaper(1.06, 300);

        int result = roomService.countTheNumberPanelsFromOneRoll(room, wallpaper);

        assertEquals(0, result);
    }

}