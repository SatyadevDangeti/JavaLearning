package com.java.learning;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicAlbum {
    private String albumName;
    private String artistName;
    private static ArrayList<Song> songs;
    private static Scanner scanner = new Scanner(System.in);
    public MusicAlbum(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songs = new ArrayList<>();
    }

    private static Song findSong(String title){
        for (Song checkedSong:songs
             ) {
            if(checkedSong.getTitle().equalsIgnoreCase(title)){
                return checkedSong;
            }
        }
        return null;
    }



    private static void printMenu(){
        System.out.println("Enter your Choice from the Menu :\npress");
        System.out.println(" 0 - to quit \n " +
                "1 - to play next song \n"+
                "2 - to play previous song \n" +
                "3 - to replay the current song \n" +
                "4 - list of songs in the playlist \n" +
                "5- print available actions \n" +
                "6- remove song for the playlist \n" +
                "7 - skip song from the playlist \n");
    }
    public void inputMusicAlbum(){
        System.out.print("Enter your choice:");
        boolean stop = false;
        while(!stop){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist Complete..");
                    stop = true;
                    break;
                case 1:
                    printMenu();
                    break;
                case 2:

                    break;

            }
        }
    }



}
