package temp.com.m.moviesapplication.API;


import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import temp.com.m.moviesapplication.APP.ApplicationScope;

@Module
public class NetworkModule {

    private final String BASE_URL="https://api.themoviedb.org/3/";

    @Provides
    public HttpLoggingInterceptor getLoggingInterceptor(){
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    }

    @Provides
    public OkHttpClient getHttpClient(HttpLoggingInterceptor loggingInterceptor){
      return new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();
    };

    @Provides
    @ApplicationScope
    public Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(new OkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }
    @ApplicationScope
    @Provides
    public MovieApiService getMovieService(Retrofit retrofit){
        return retrofit.create(MovieApiService.class);
    }
    @ApplicationScope
    @Provides
    public Gson providesGsonInstance(){
        return new Gson();

    }


}
