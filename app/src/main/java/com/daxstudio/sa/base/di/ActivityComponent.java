package com.daxstudio.sa.base.di;

import android.support.v7.app.AppCompatActivity;
import dagger.Subcomponent;


/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(AppCompatActivity Activity);

}
