package temp.com.m.moviesapplication.API;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import temp.com.m.moviesapplication.API.Models.MovieResponse;
import temp.com.m.moviesapplication.API.Models.MoviesModel;

public interface MovieApiService {

    @GET("movie/top_rated?api_key=81eadf5fd22624300fca1919ed2fad54&language=en-US&page=1")
    Observable<MovieResponse>getMovies();
}
