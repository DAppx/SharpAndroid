package com.daxstudio.sa.base.di;

import dagger.Component;
import com.daxstudio.sa.base.di.ActivityModule;
import com.daxstudio.sa.base.di.ApplicationComponent;
import com.daxstudio.sa.base.di.ConfigPersistent;


/**
 * A dagger component that will live during the lifecycle of an Activity but it won't
 * be destroy during configuration changes. Check  BaseActivity to see how this components
 * survives configuration changes.
 * Use the {@link ConfigPersistent} scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = ApplicationComponent.class)
public interface ConfigPersistentComponent {

    ActivityComponent activityComponent(ActivityModule activityModule);

}