package com.daxstudio.sa.base.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by DAppx(github.com/DAppx) on 11/10/2016.by daxstudio
 *
 * A custom {@link Scope} for every Android Activity. === ActivityScope
 *
 * A scoping annotation to permit objects whose lifetime should
 * conform to the life of the Activity to be memorised in the
 * correct component.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
