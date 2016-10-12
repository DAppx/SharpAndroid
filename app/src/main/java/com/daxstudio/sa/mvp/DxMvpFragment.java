package com.daxstudio.sa.mvp;

import android.os.Bundle;
import android.support.v4.app.Fragment;


/**
 * Created by DAppx(github.com/DAppx) on 11/10/2016.by daxstudio
 * component.support
 */

public abstract class DxMvpFragment<V extends DxView, P extends DxPresenter<V>> extends Fragment
        implements DxView {

    private DxViewDelegate<V, P> mDxViewDelegate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDxViewDelegate = new DxViewDelegate<V, P>() {
            @Override
            protected P createPresenter() {
                return DxMvpFragment.this.createPresenter();
            }
        };
        mDxViewDelegate.onCreate(savedInstanceState);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onStart() {
        super.onStart();
        mDxViewDelegate.onStart((V) this);
    }

    @Override
    public void onStop() {
        super.onStop();
        mDxViewDelegate.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mDxViewDelegate.onDestroy();
    }

    protected abstract P createPresenter();
}
