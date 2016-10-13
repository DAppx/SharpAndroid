package com.daxstudio.sa.ui.di;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.daxstudio.sa.base.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(final Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    Resources provideResources() {
        return mApplication.getResources();
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mApplication;
    }

//    @Provides
//    @Singleton
//    RibotsService provideRibotsService() {
//        return RibotsService.Creator.newRibotsService();
//    }

}
