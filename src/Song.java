public class Song {

    private String tittle;
    private double duration;
    //artist,genre,we can add

    public Song(String tittle, double duration) {
        this.tittle = tittle;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song you are listening to {" +
                "tittle='" + tittle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
