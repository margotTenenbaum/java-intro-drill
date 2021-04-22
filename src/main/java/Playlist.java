import java.util.ArrayList;

public class Playlist {
  public String name;
  public boolean empty = true;
  public ArrayList<Song> playlist = new ArrayList<Song>();
  public int index = 0;

  public Playlist(String name) {
    this.name = name;
  }

  public boolean isEmpty() {
    return empty;
  }

  public void addSong(Song song) {
    playlist.add(song);
    this.index++;
    this.empty = false;
  }

  public String[] songNames() {
    String[] songNames = new String[index];
    int i = 0;
    for (Song song : playlist) {
      songNames[i] = song.title;
      i++;
    }

    return songNames;
  }

  public int totalDuration() {
    int totalDur = 0;
    int i = 0;
    for (Song song : playlist) {
      totalDur+= song.durationInSeconds;
      i++;
    }
    return totalDur;
  }

  public void swap(Song song1, Song song2) {
    //get indices
    int index1 = playlist.indexOf(song1);
    int index2 = playlist.indexOf(song2);
    //swap them
    playlist.set(index1, song2);
    playlist.set(index2, song1);
  }
}
