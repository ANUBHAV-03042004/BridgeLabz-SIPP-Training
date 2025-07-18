package player;

public class Player {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addMedia("hi");
        player.addMedia("bye");
        player.addMedia("yes");
        player.addMedia("no");
        player.addMedia("cat");
        player.addMedia("six");
        player.addMedia("mix");
        player.addMedia("fix");

        player.sortPlaylist();
        player.displayMediaList();

        System.out.println(player.playNext());
        System.out.println(player.playNext());
        System.out.println(player.playPrev());
        System.out.println(player.playPrev());
        System.out.println("Current: " + player.currentSong());

        player.playMedia();
        player.resumeMedia(5);

        player.removeMedia();
        player.displayMediaList();
    }
}