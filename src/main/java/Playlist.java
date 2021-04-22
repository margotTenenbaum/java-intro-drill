import java.util.ArrayList;

public class Playlist {
  public String name;
  public boolean empty = true;
  public ArrayList<Song> playlist = new ArrayList<Song>();

  public Playlist(String name) {
    this.name = name;
  }

  public boolean isEmpty() {
    return empty;
  }

  public void addSong(Song song) {
    playlist.add(song);
    this.empty = false;
  }
}
