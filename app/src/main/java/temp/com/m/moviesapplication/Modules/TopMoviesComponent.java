package temp.com.m.moviesapplication.Modules;

import dagger.Component;
import dagger.Subcomponent;
import temp.com.m.moviesapplication.APP.ActivityScope;

@ActivityScope
@Subcomponent(modules = TopMoviesModule.class)
public interface TopMoviesComponent {
    public void inject(TopMoviesActivity activity);

}
