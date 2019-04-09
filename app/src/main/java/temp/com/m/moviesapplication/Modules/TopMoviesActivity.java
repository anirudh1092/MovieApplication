package temp.com.m.moviesapplication.Modules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import temp.com.m.moviesapplication.API.Models.MovieResponse;
import temp.com.m.moviesapplication.API.MovieApiService;
import temp.com.m.moviesapplication.API.NetworkModule;
import temp.com.m.moviesapplication.APP.AppComponent;
import temp.com.m.moviesapplication.APP.MoviesApplication;
import temp.com.m.moviesapplication.R;

public class TopMoviesActivity extends AppCompatActivity implements TopMoviesContract.View{

    @Inject
    TopMoviesContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_movies);
        ((MoviesApplication)getApplication()).getAppComponent().plus(new TopMoviesModule()).inject(this);
        String mystring = getResources().getString(R.string.api_Key);
        presenter.makeMoviesServiceCall();


    }

    @Override
    public void showError() {

    }
}
