package player;

abstract class MediaPlayer {
    public abstract void addMedia(String title);
    public abstract void removeMedia();
    public abstract void playMedia();
    public abstract void pauseMedia();
    public abstract void resumeMedia(int index);
    public abstract void displayMediaList();
}