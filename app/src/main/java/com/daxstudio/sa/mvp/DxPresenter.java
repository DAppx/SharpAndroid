package com.daxstudio.sa.mvp;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;

/**
 * Created by DAppx(github.com/DAppx) on 11/10/2016.by daxstudio
 */

public abstract class DxPresenter<V extends DxView> {

    private V mView;

    @CallSuper
    public void attachView(V view) {
        mView = view;
    }

    @CallSuper
    public void detachView() {
        mView = null;
    }

    @CallSuper
    public void onDestroy() {
        if (isViewAttached()) {
            throw new IllegalStateException("View should been detached before destroy!");
        }
    }

    protected boolean isViewAttached() {
        return mView != null;
    }

    @NonNull
    protected V getView() {
        if (mView == null) {
            throw new IllegalStateException("View has been detached!");
        }
        return mView;
    }
}
