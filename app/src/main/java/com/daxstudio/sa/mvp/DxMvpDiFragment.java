package com.daxstudio.sa.mvp;

import android.os.Bundle;


/**
 * Created by DAppx(github.com/DAppx) on 11/10/2016.by daxstudio
 *
 */

public abstract class DxMvpDiFragment<V extends DxView, P extends DxPresenter<V>, C extends
        BaseComponent<V, P>>
        extends DxMvpFragment<V, P> {

    protected P mPresenter;

    @SuppressWarnings("unchecked")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        C component = ((HasComponent<C>) getActivity()).getComponent();
        mPresenter = component.presenter();
        injectDependencies(component);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected P createPresenter() {
        return mPresenter;
    }

    /**
     * inject dependencies.
     * Normally implementation should be {@code component.inject(this)}
     */
    protected abstract void injectDependencies(C component);
}
