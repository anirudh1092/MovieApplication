package temp.com.m.moviesapplication.Modules;

import dagger.Module;
import dagger.Provides;
import temp.com.m.moviesapplication.API.MovieApiService;

@Module
public class TopMoviesModule {

    @Provides
    TopMoviesContract.Repository providesRepository(MovieApiService service){
        return new TopMoviesRepository(service);
    }

    @Provides
    TopMoviesContract.Presenter providesPresenter(TopMoviesContract.Repository repository){
        return new TopMoviesPresenter(repository);
    }



}
