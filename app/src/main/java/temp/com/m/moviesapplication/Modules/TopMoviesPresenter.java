package temp.com.m.moviesapplication.Modules;

import android.content.Context;
import android.util.Log;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import temp.com.m.moviesapplication.API.Models.MovieResponse;
import temp.com.m.moviesapplication.API.Models.MoviesModel;

import static android.content.ContentValues.TAG;

public class TopMoviesPresenter implements TopMoviesContract.Presenter {


    TopMoviesContract.Repository repository;
    TopMoviesActivity view;
    public TopMoviesPresenter(TopMoviesContract.Repository repository) {
        this.repository = repository;
    }


    @Override
    public void makeMoviesServiceCall() {
        repository.getDataFromService().subscribe(new Observer<MovieResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(MovieResponse movieResponse) {
                Log.d(TAG, "onNext: "+movieResponse.moviesList);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    @Override
    public void viewOnCreate(TopMoviesActivity view) {
        this.view=view;
    }

    @Override
    public void viewOnStart() {

    }
}
