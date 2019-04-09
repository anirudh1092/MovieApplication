package temp.com.m.moviesapplication.APP;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import temp.com.m.moviesapplication.API.NetworkModule;

@Module(includes = NetworkModule.class)
public class MoviesApplicationModule {

        MoviesApplication application;

    public MoviesApplicationModule(MoviesApplication application) {
        this.application = application;
    }

    @Provides
        public MoviesApplication providesApplication(){
            return application;
        }


}
