package dev.sneyki.PlusWars.Models;

public class Films {
    private String title;
    private int episode_id;
    private String director;
    private String opening_crawl;
    private String release_date;

    public Films(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return  "Titulo = " + title + '\n' +
                "ID del episodio = " + episode_id + "\n" +
                "director = " + director + '\n' +
                "Texto de inicio = " + opening_crawl + '\n' +
                " " + "\n" +
                "Fecha de lanzamiento = " + release_date + '\n';
    }
}
