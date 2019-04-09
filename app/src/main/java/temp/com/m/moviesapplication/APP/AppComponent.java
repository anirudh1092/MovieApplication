package temp.com.m.moviesapplication.APP;

import dagger.Component;
import temp.com.m.moviesapplication.Modules.TopMoviesComponent;
import temp.com.m.moviesapplication.Modules.TopMoviesModule;


@ApplicationScope
@Component(modules = {MoviesApplicationModule.class})
public interface AppComponent {

    TopMoviesComponent plus(TopMoviesModule module);
}
