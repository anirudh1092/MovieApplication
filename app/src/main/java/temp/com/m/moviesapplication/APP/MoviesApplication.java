package temp.com.m.moviesapplication.APP;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import temp.com.m.moviesapplication.API.NetworkModule;
import temp.com.m.moviesapplication.Modules.TopMoviesComponent;


public class MoviesApplication extends Application {

    AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent=DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }


}
