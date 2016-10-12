package com.daxstudio.sa.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by DAppx(github.com/DAppx) on 11/10/2016.by daxstudio
 */

public abstract class DxViewDelegate<V extends DxView, P extends DxPresenter<V>> {
    private P mPresenter;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = createPresenter();
    }

    public void onStart(V view) {
        checkPresenter();
        mPresenter.attachView(view);
    }

    public void onStop() {
        checkPresenter();
        mPresenter.detachView();
    }

    public void onDestroy() {
        checkPresenter();
        mPresenter.onDestroy();
    }

    protected abstract P createPresenter();

    private void checkPresenter() {
        if (mPresenter == null) {
            throw new IllegalStateException("call onCreate in DxViewDelegate!");
        }
    }
}
