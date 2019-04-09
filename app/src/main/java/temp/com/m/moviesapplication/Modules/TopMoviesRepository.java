package temp.com.m.moviesapplication.Modules;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import temp.com.m.moviesapplication.API.Models.MovieResponse;
import temp.com.m.moviesapplication.API.MovieApiService;

public class TopMoviesRepository implements TopMoviesContract.Repository {

    MovieApiService service;

    public TopMoviesRepository(MovieApiService service) {
        this.service=service;
    }


    @Override
    public Observable<MovieResponse> getDataFromService() {
        return service.getMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }
}
