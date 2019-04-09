package temp.com.m.moviesapplication.API.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MoviesModel {
    @SerializedName("title")

    String title;

    @SerializedName("poster_path")

    String poster_path;

    @SerializedName("overview")
    String overview;


    double popularity;

    public MoviesModel(String title, String poster_path, String overview, double popularity) {
        this.title = title;
        this.poster_path = poster_path;
        this.overview = overview;
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }
}
