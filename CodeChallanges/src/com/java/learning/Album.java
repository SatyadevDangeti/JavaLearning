package com.java.learning;

import java.util.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    protected boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs
        ) {
            if (checkedSong.getTitle().equalsIgnoreCase(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    protected boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= songs.size())) {
            playList.add(songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    protected boolean addSongToPlaylist(String title, LinkedList<Song> playlist) {
        Song checkSong = findSong(title);
        if (checkSong != null) {
            playlist.add(checkSong);
            return true;
        }
        System.out.println("The song: " + title + " is not available in the album");
        return false;
    }

    private static void printMenu() {
        System.out.println("Enter your Choice from the Menu :\npress");
        System.out.println(" 0 - to quit \n " +
                "1 - to play next song \n" +
                "2 - to play previous song \n" +
                "3 - to replay the current song \n" +
                "4 - list of songs in the playlist \n" +
                "5- print available actions \n" +
                "6- remove song for the playlist \n" +
                "7 - skip song from the playlist \n");
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> playlistIterator = playlist.listIterator();
        System.out.println("==========================");
        while (playlistIterator.hasNext()) {
            System.out.println(playlistIterator.next());
        }
        System.out.println("===========================");
    }


    public static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No Songs to play in the playlist");
        } else {
            System.out.println("Now Playing: " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist Completed.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Playing next track/song : " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Playing previous track/song:  " + listIterator.previous().toString());
                    } else {
                        System.out.println("We just started the playlist , Move Forward");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying: " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We just started the playlist , Move Forward");

                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached end of playlist");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {

                        if (listIterator.hasPrevious()) {
                            System.out.println("Removed the current track from the playlist " + listIterator.previous().toString());
                        } else if (listIterator.hasNext()) {
                            System.out.println("Removed the current track from the playlist " + listIterator.next().toString());
                        } else {
                            System.out.println("Deleted all the  Songs in playlist , Add more");

                        }

                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing x" + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("Deleted all the  Songs in playlist , Add more");

                        }
                    } else {
                        System.out.println("Press 0 to quit and Add More Songs to the Play list");

                    }
                    break;

                case 7:
                        if(!forward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            forward = true;
                        }
                    if(listIterator.hasNext()) {
                        System.out.println("Skipping the next song in the playlist " + listIterator.next());

                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing " + listIterator.next());


                        }
                    }
                        else{

                            System.out.println("Reached End of the playlist ");

                        }

            }
        }
    }
}
