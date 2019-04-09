package temp.com.m.moviesapplication.Modules;

import io.reactivex.Observable;
import temp.com.m.moviesapplication.API.Models.MovieResponse;

public interface TopMoviesContract {

    interface Repository{
        public Observable<MovieResponse> getDataFromService();
    }

    interface Presenter{
        public void makeMoviesServiceCall();
        public void viewOnCreate(TopMoviesActivity view);
        public void viewOnStart();
    }

    interface View{
        public void showError();
    }


    interface Navigator{
        public void navigateToSelectedMoviesScreen();
    }

}
