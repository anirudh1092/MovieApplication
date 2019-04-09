package temp.com.m.moviesapplication.API.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MovieResponse {

    @SerializedName("moviesList")
   public List<MoviesModel>moviesList;


    public MovieResponse(List<MoviesModel> moviesList) {
        this.moviesList = moviesList;
    }

    public void setMoviesList(List<MoviesModel> moviesList) {
        this.moviesList = moviesList;
    }
}
