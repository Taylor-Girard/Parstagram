package com.taylorgirard.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hGcoVnwu6jtFUf6YtX0fYUqO0WAMvRU3CsoVQXaE")
                .clientKey("EyLOkGEhXDC2JmBdI4rtwXycZqn7qerZUtsyCo9Q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
