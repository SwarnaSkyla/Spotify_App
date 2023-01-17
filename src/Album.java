import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Album {

    private String name;
    private String artist;

    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public  boolean findSong(String tittle){
        for(Song s:songs){
            if(s.getTittle().equals(tittle)){
                return true;
            }
        }
        return false;
    }
    void addSongtoAlbum(String tittle,double duration){
        Song s=new Song(tittle,duration);

        if(findSong(s.getTittle())==true){
            System.out.println("Song already present in album");
        }
        else{
            songs.add(s);
            System.out.println("New Song has been Added");
        }
        return ;

    }
    //polymorphism
    public void addToPlaylistFromAlbum(String tittle, LinkedList<Song> playList){

        if(findSong(tittle)==true){
            for (Song song :songs){
                if(song.getTittle().equals(tittle)){
                    playList.add(song);
                    System.out.println("Song had been added to your playlist");
                    break;
                }
            }
        }
        else{
            System.out.println("Song is not present in Album");
        }
        return ;

    }

    public void addToPlaylistFromAlbum(int trackNo, LinkedList<Song> playList){

        int index=trackNo-1;
        if(index>0 && index<songs.size()){
            playList.add(songs.get(index));
        }
        else{
            System.out.println("Imvalid track number");
        }
        return ;
    }

}
