package player;

import java.util.Scanner;
public class MusicPlayer extends MediaPlayer {
    private class SongNode {
        String title;
        SongNode next, prev;

        SongNode(String title) {
            this.title = title;
        }
    }

    private SongNode head = null, tail = null;
    private Scanner sc = new Scanner(System.in);

    // Add song to end
    @Override
    public void addMedia(String title) {
        SongNode newNode = new SongNode(title);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove song from beginning
    @Override
    public void removeMedia() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Removed: " + head.title);
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
    }

    // Play current song with pause option
    @Override
    public void playMedia() {
        if (head == null) {
            System.out.println("No song to play.");
            return;
        }
        String song = head.title;
        int index = 0;
        for (char ch : song.toCharArray()) {
            System.out.println("Char: " + ch + " | Pause? (yes/no)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                System.out.println("Paused at index: " + index);
                return;
            }
            index++;
        }
        System.out.println("Song finished.");
    }

    @Override
    public void pauseMedia() {
        System.out.println("Paused.");
    }

    @Override
    public void resumeMedia(int index) {
        if (head == null || index >= head.title.length()) {
            System.out.println("Invalid resume point.");
            return;
        }
        String remaining = head.title.substring(index);
        System.out.println("Resuming from: " + remaining);
        playMedia(); // Simulate replay
    }

    @Override
    public void displayMediaList() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        SongNode temp = head;
        System.out.println("Current Playlist:");
        while (temp != null) {
            System.out.println("-> " + temp.title);
            temp = temp.next;
        }
    }

    // Additional features
    public void sortPlaylist() {
        for (SongNode i = head; i != null; i = i.next) {
            for (SongNode j = i.next; j != null; j = j.next) {
                if (j.title.compareTo(i.title) < 0) {
                    String temp = i.title;
                    i.title = j.title;
                    j.title = temp;
                }
            }
        }
    }

    public String playNext() {
        if (head == null || head.next == null) return "End of playlist";
        head = head.next;
        return "Now playing: " + head.title;
    }

    public String playPrev() {
        if (head == null || head.prev == null) return "No previous song";
        head = head.prev;
        return "Now playing: " + head.title;
    }

    public String currentSong() {
        return head != null ? head.title : "No song playing";
    }
}